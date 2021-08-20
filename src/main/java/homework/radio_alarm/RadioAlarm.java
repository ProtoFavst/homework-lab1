package homework.radio_alarm;

public class RadioAlarm implements Radio, Alarm{

    @Override
    public void c() {
        System.out.println("Method C works");
    }

    @Override
    public void d() {
        System.out.println("Method D works");
    }

    @Override
    public void a() {
        System.out.println("Method A works");
    }

    @Override
    public void b() {
        System.out.println("Method B works");
    }
    
}
