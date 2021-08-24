package homework.never_use_switch;

import java.util.Map;

public class MailSender {
    Map<Integer,  SendMail> map = Map.of(1, new MailType1(), 2, new MailType2());
          //todo refactor this to beautiful code
             public void send(MailInfo mailInfo) {

      map.get(mailInfo.getMailType()).sendMail(mailInfo);

    }}