import java.util.Properties;
import java.util.Scanner;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Notificacao {
	
	protected String titulo;
	protected String mensagem;
	private Scanner input;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	public void enviar_Mensagem(String mensagem, String assunto, String contato) {
	      
		Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                         protected PasswordAuthentication getPasswordAuthentication()
                         {
                               return new PasswordAuthentication("testediacom@gmail.com", "123diacomteste");
                         }
                    });

        /** Ativa Debug para sessão */
        session.setDebug(true);

        try {

              Message message = new MimeMessage(session);
              message.setFrom(new InternetAddress("Software IC")); //Remetente

              Address[] toUser = InternetAddress //Destinatário(s)
                         .parse(contato);  

              message.setRecipients(Message.RecipientType.TO, toUser);
              message.setSubject(assunto);//Assunto
              message.setText(mensagem);
              /**Método para enviar a mensagem criada*/
              Transport.send(message);

              System.out.println("\nE-mail enviado com sucesso!");

         } catch (MessagingException e) {
              throw new RuntimeException(e);
     }
  }
	
	public void entrar_Em_Contato(){ // Chamar este método para envio de mensagens para o DIACOM  
		
		input = new Scanner(System.in);
		String mensagem = new String();
		String assunto = new String();
		String diacom = new String();
		String discentes = new String();
		String contato = new String();
		int escolha = 0;
		
		discentes = "discentes@ic.ufal.br";
		diacom = "diacom@ic.ufal.br";
		
		System.out.println("Selecione para quem esta mensagem será enviada:\n1 - DIACOM\n2 - Discentes");
		
		try{
			escolha = input.nextInt();
		}catch(Exception e){
			System.out.println("Entrada Inválida!");
		}
		
		if(escolha == 1){
			contato = diacom;
		}else{
			contato = discentes;
		}
		
		System.out.print("\nDigite o assunto do E-mail: ");
		
		assunto = input.nextLine();
		
		System.out.println("Digite sua mensagem: ");
		
		mensagem = input.nextLine();
		
		enviar_Mensagem(mensagem,assunto,contato);
		
		System.out.println("SUCESSO!");
		
	}
}
