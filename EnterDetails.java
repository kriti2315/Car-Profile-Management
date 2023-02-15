import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class EnterDetails {
    //Declare textfilelds
    static JTextField brandField;
    static JTextField modelField;
    static JTextField colorField;
    static JTextField yearField;
    static JTextField engineNoField;
    static JTextField seatsField;
    static JTextField licenseField;
    static JTextField ownersNameField;
    static JTextField telephoneNoField;
    static JTextField emailField;
    static JTextField driverLicenseField;
    static JTextField securityNoField;
    static JTextField addressField;
    static JTextField warrantyYearField;
    static JLabel uploadImageLabel = new JLabel("upload Image of car");
    static JFileChooser browseImageFile = new JFileChooser();
    static JLabel imageLabel = new JLabel();

    public EnterDetails(){
//declare frame and set layout
        JFrame frame = new JFrame("enter details");
        frame.setSize(600,600);
        frame.setVisible(true);
        //frame.setResizable(false);
        //frame.setLayout(new GridLayout(10,1));
        JLabel l1 = new JLabel("Car Profile Management");
        l1.setFont(new Font("Times New Roman",Font.BOLD,24));
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frame.setLayout(flow);
        flow.setVgap(20);
        flow.setHgap(20);
        JPanel panel = new JPanel(new GridLayout());
        JPanel panel1 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel2 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel3 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel4 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel5 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel6 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel7 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel8 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel9 = new JPanel(new GridLayout(1,5,10,10));


        //insert image labels and text fields for the input entries
        JLabel brandLabel = new JLabel("Brand");
        brandField = new JTextField(10);

        JLabel modelLabel = new JLabel("Model");
        modelField = new JTextField(10);

        JLabel colorLabel = new JLabel("color");
        colorField = new JTextField(10);

        JLabel yearLabel = new JLabel("Year");
        yearField = new JTextField(10);

        JLabel engineNoLabel = new JLabel("Engine No");
        engineNoField = new JTextField(10);

        JLabel seatsLabel = new JLabel("Seats number");
        seatsField = new JTextField(10);

        JLabel licenseLabel = new JLabel("License plate");
        licenseField = new JTextField(10);

        JLabel ownersNameLabel = new JLabel("Owners name");
        ownersNameField = new JTextField(10);

        JLabel telephoneNoLabel = new JLabel("Telephone no");
        telephoneNoField = new JTextField(10);

        JLabel emailLabel = new JLabel("Email");
        emailField = new JTextField(10);

        JLabel driverLicenseLabel = new JLabel("Driver license");
        driverLicenseField = new JTextField(10);

        JLabel securityNoLabel = new JLabel("Social security No");
        securityNoField = new JTextField(10);

        JLabel addressLabel = new JLabel("Owners address");
        addressField = new JTextField(10);

        JLabel warrantyYearLabel = new JLabel("Warranty Year");
        warrantyYearField = new JTextField(10);

        JLabel uploadImageLabel = new JLabel("upload Image of car");

        JButton button = new JButton("Upload");
        button.setSize(100,50);

        //button for browse and image upload
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
                browseImageFile.addChoosableFileFilter(fnef);
                int showOpenDialogue = browseImageFile.showOpenDialog(null);

                if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
                    File selectedImageFile = browseImageFile.getSelectedFile();
                    String selectedImagePath =  selectedImageFile.getAbsolutePath();
                    JOptionPane.showMessageDialog(null,"Image has been uploaded successfully");
                    ImageIcon ii = new ImageIcon(selectedImagePath);
                    Image image = ii.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(image));

                }
            }
        });

        JButton serviceButton = new JButton("Enter Service records");
        serviceButton.setSize(50,50);
        serviceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ServiceRecords serviceRecords = new ServiceRecords();
            }
        });

        JButton submit = new JButton("Submit");
        //add aaction listener to button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //checks for validation
                if(brandField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the brand name","Car profile management",JOptionPane.ERROR_MESSAGE);
                    brandField.requestFocus();
                    return;
                }
                if(modelField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the model name","Car profile management",JOptionPane.ERROR_MESSAGE);
                    modelField.requestFocus();
                    return;
                }
                if(colorField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the color","Car profile management",JOptionPane.ERROR_MESSAGE);
                    colorField.requestFocus();
                    return;
                }
                if(yearField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the year ","Car profile management",JOptionPane.ERROR_MESSAGE);
                    yearField.requestFocus();
                    return;
                }

                if(engineNoField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the engineNo ","Car profile management",JOptionPane.ERROR_MESSAGE);
                    engineNoField.requestFocus();
                    return;
                }
                if(seatsField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the seats","Car profile management",JOptionPane.ERROR_MESSAGE);
                    seatsField.requestFocus();
                    return;
                }
                if(licenseField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the license plate","Car profile management",JOptionPane.ERROR_MESSAGE);
                    licenseField.requestFocus();
                    return;
                }
                if(ownersNameField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the owners name","Car profile management",JOptionPane.ERROR_MESSAGE);
                    ownersNameField.requestFocus();
                    return;
                }
                if(telephoneNoField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the telephoneNo ","Car profile management",JOptionPane.ERROR_MESSAGE);
                    telephoneNoField.requestFocus();
                    return;
                }
                if(emailField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the email","Car profile management",JOptionPane.ERROR_MESSAGE);
                    emailField.requestFocus();
                    return;
                }
                if(driverLicenseField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the driver license no","Car profile management",JOptionPane.ERROR_MESSAGE);
                    driverLicenseField.requestFocus();
                    return;
                }
                if(securityNoField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the securityNo ","Car profile management",JOptionPane.ERROR_MESSAGE);
                    securityNoField.requestFocus();
                    return;
                }
                if(addressField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the address ","Car profile management",JOptionPane.ERROR_MESSAGE);
                    addressField.requestFocus();
                    return;
                }
                if(warrantyYearField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the warranty Year ","Car profile management",JOptionPane.ERROR_MESSAGE);
                    warrantyYearField.requestFocus();
                    return;
                }
                if(imageLabel.getIcon()==null){
                    JOptionPane.showMessageDialog(frame,"You must upload the image ","Car profile management",JOptionPane.ERROR_MESSAGE);
                    return;
                }


                JOptionPane.showMessageDialog(frame,"your details have been saved","submitted",JOptionPane.INFORMATION_MESSAGE);
                frame.dispose();
            }
        });

        //add the panels and entries to the frame
        panel.add(l1);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);

        panel1.add(brandLabel);
        panel1.add(brandField);
        panel1.add(modelLabel);
        panel1.add(modelField);
        panel2.add(colorLabel);
        panel2.add(colorField);
        panel2.add(yearLabel);
        panel2.add(yearField);
        panel3.add(engineNoLabel);
        panel3.add(engineNoField);
        panel3.add(seatsLabel);
        panel3.add(seatsField);
        panel4.add(licenseLabel);
        panel4.add(licenseField);
        panel4.add(ownersNameLabel);
        panel4.add(ownersNameField);
        panel5.add(telephoneNoLabel);
        panel5.add(telephoneNoField);
        panel5.add(emailLabel);
        panel5.add(emailField);
        panel6.add(driverLicenseLabel);
        panel6.add(driverLicenseField);
        panel6.add(securityNoLabel);
        panel6.add(securityNoField);
        panel7.add(addressLabel);
        panel7.add(addressField);
        panel7.add(warrantyYearLabel);
        panel7.add(warrantyYearField);
        panel8.add(uploadImageLabel);
        panel8.add(button);
        panel8.add(imageLabel);
        panel9.add(serviceButton);
        panel9.add(submit);
    }
}
