import java.awt.*;

public class form {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);

        Label l1 = new Label("Student Form");
        l1.setBounds(200, 50, 100, 30);

        Label name = new Label("Name of Student: ");
        name.setBounds(50, 100, 120, 30);
        TextField nametxt = new TextField();
        nametxt.setBounds(200, 100, 200, 30);

        Label address = new Label("Address of Student: ");
        address.setBounds(50, 150, 120, 30);
        TextField addresstxt = new TextField();
        addresstxt.setBounds(200, 150, 200, 30);

        Label qualification = new Label("Qualification of Student");
        qualification.setBounds(50, 200, 150, 30);
        Checkbox tenth = new Checkbox("10th");
        tenth.setBounds(200, 200, 50, 30);
        Checkbox twelfth = new Checkbox("12th");
        twelfth.setBounds(260, 200, 50, 30);

        Label city = new Label("Select City");
        city.setBounds(50, 250, 100, 30);
        List l = new List(4);
        l.setBounds(200, 250, 200, 60);
        l.add("Panvel");
        l.add("Khandeshwar");
        l.add("Mansarovar");
        l.add("Kharghar");

        f.add(l1);
        f.add(name);
        f.add(nametxt);
        f.add(address);
        f.add(addresstxt);
        f.add(qualification);
        f.add(tenth);
        f.add(twelfth);
        f.add(city);
        f.add(l);
    }
}
