import java.awt.*;

class Main extends Frame {
    // definisi komponen
    Button ok, cancel;
    List list;
    Choice choice;
    CheckboxGroup checkbox_group;
    Checkbox[] checkboxes;
    TextField textfield;
    TextArea textarea;
    Scrollbar scroll1;
    Scrollbar scroll2;
    Label label;

    Panel panel1, panel2;
    Panel buttonpanel;

    // constructor
    public Main(String title) {
        super(title);

        // menciptakan elemen
        // 1. Button
        ok = new Button("OK");
        cancel = new Button("Cancel");

        // 2. choice
        choice = new Choice();
        choice.addItem("PGSD");
        choice.addItem("PGPAUD");
        choice.addItem("SISTEL");
        choice.addItem("PSTI");

        // 3. checkbox
        checkbox_group = new CheckboxGroup();
        checkboxes = new Checkbox[3];
        checkboxes[0] = new Checkbox("Setuju", checkbox_group, false);
        checkboxes[1] = new Checkbox("Kurang Setuju", checkbox_group, true);
        checkboxes[2] = new Checkbox("Tidak Setuju", checkbox_group, false);

        // 4. list
        list = new List(3, true);
        list.addItem("Java");
        list.addItem("C++");
        list.addItem("Pascal");
        list.addItem("Visual Basic");
        list.addItem("Modula-3");

        // 5. textfield
        textfield = new TextField(15);

        // 6. textarea
        textarea = new TextArea(6, 30);
        textarea.setText("Teks yang ditampilkan dalam textArea ini\n tidak bisa di-edit");
        textarea.setEditable(false);

        // 7. scrollbar
        scroll1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 100);
        scroll2 = new Scrollbar(Scrollbar.VERTICAL, 0, 5, 0, 100);

        // 8. label
        label = new Label("Contoh berbagai komponen GUI");

        // 9. panel
        // membuat panel
        panel1 = new Panel();
        panel2 = new Panel();
        buttonpanel = new Panel();

        setLayout(null);
        label.setBounds(50, 45, 250, 25);
        panel1.setBounds(10, 75, 200, 150);
        panel2.setBounds(300, 50, 250, 250);
        buttonpanel.setBounds(10, 250, 100, 100);

        // menempatkan komponen dalam panel
        panel1.add(textfield);
        panel1.add(choice);
        panel1.add(checkboxes[0]);
        panel1.add(checkboxes[1]);
        panel1.add(checkboxes[2]);
        panel1.add(list);

        panel2.add(textarea);
        panel2.add(scroll1);
        panel2.add(scroll2);

        buttonpanel.add(ok);
        buttonpanel.add(cancel);

        this.add(label);
        this.add(panel1);
        this.add(panel2);
        this.add(buttonpanel);
    }

    public static void main(String[] args) {
        Frame f = new Main("Demo Komponen AWT");
        f.pack();
        f.resize(600, 300);
        f.show();
    }
}
