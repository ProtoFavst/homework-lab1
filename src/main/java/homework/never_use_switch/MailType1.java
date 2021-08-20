package homework.never_use_switch;

public class MailType1  implements SendMail {



    @Override
    public void sendMail(MailInfo mailInfo) {
        //bla-bla-bla
        System.out.println("Welcome mail was sent" + mailInfo.getContext());
    }
}
