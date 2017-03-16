import java.util.GregorianCalendar;
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


public class Contato extends Notificacao {

	private GregorianCalendar dataHoraDeCriacao;
	private Scanner input;

	public GregorianCalendar getDataHoraDeCriacao() {
		return dataHoraDeCriacao;
	}

	public void setDataHoraDeCriacao(GregorianCalendar dataHoraDeCriacao) {
		this.dataHoraDeCriacao = dataHoraDeCriacao;
	}
	
	public void enviar_Mensagem(String mensagem, String assunto) {
      
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
              message.setFrom(new InternetAddress("seuemail@gmail.com")); //Remetente

              Address[] toUser = InternetAddress //Destinatário(s)
                         .parse("rwvlm@ic.ufal.br");  

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
		
		System.out.print("Digite o assunto do E-mail: ");
		
		assunto = input.nextLine();
		
		System.out.println("Digite sua mensagem: ");
		
		mensagem = input.nextLine();
		
		enviar_Mensagem(mensagem,assunto);
		
		System.out.println("SUCESSO!");
		
	}
	
	//implementar metodos de: criacao, remocao e consulta de contato (ordenado por data)
	//preparar relatorio com lista de contatos feitos no mes/semestre
}
