package homework.never_use_switch;

public class MailType2  implements SendMail {



    @Override
    public void sendMail(MailInfo mailInfo) {
        //bla-bla-bla
        System.out.println("Happy Birthdate mail was sent" + mailInfo.getContext());
    }
}
