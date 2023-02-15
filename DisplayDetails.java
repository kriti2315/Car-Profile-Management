import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayDetails  {
    DisplayDetails(){

        //declaration of frames and panels and set layouts
        JFrame frame = new JFrame("enter details");
        frame.setSize(700,750);


        JLabel l1 = new JLabel("Car Profile Management");
        l1.setFont(new Font("Times New Roman",Font.BOLD,24));
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frame.setLayout(flow);
        flow.setVgap(10);
        flow.setHgap(50);
        frame.setLayout(new GridLayout(10,1));
        JPanel panel = new JPanel(new GridLayout());
        JPanel panel1 = new JPanel(new GridLayout());
        JPanel panel2 = new JPanel(new GridLayout());
        JPanel panel3 = new JPanel(new GridLayout());
        JPanel panel4 = new JPanel(new GridLayout());
        JPanel panel5 = new JPanel(new GridLayout());
        JPanel panel6 = new JPanel(new GridLayout());
        JPanel panel7 = new JPanel(new GridLayout());
        JPanel panel8 = new JPanel(new GridLayout());
        JPanel panel9 = new JPanel();

        JLabel brandLabel = new JLabel("Brand:");
        JLabel brandName = new JLabel(EnterDetails.brandField.getText());

        JLabel modelLabel = new JLabel("Model:");
        JLabel modelName = new JLabel(EnterDetails.modelField.getText());

        JLabel colorLabel = new JLabel("color:");
        JLabel colorName = new JLabel(EnterDetails.colorField.getText());

        JLabel yearLabel = new JLabel("Year:");
        JLabel year = new JLabel(EnterDetails.yearField.getText());

        JLabel engineNoLabel = new JLabel("Engine No:");
        JLabel engineNo = new JLabel(EnterDetails.engineNoField.getText());

        JLabel seatsLabel = new JLabel("Seats number:");
        JLabel seats = new JLabel(EnterDetails.seatsField.getText());

        JLabel licenseLabel = new JLabel("License plate:");
        JLabel licenseNo = new JLabel(EnterDetails.licenseField.getText());

        JLabel ownersNameLabel = new JLabel("Owners name:");
        JLabel ownerName = new JLabel(EnterDetails.ownersNameField.getText());

        JLabel telephoneNoLabel = new JLabel("Telephone no:");
        JLabel telephoneNo = new JLabel(EnterDetails.telephoneNoField.getText());

        JLabel emailLabel = new JLabel("Email:");
        JLabel email = new JLabel(EnterDetails.emailField.getText());

        JLabel driverLicenseLabel = new JLabel("Driver license:");
        JLabel drivingLicenseNo = new JLabel(EnterDetails.driverLicenseField.getText());

        JLabel securityNoLabel = new JLabel("Social security No:");
        JLabel securityNo = new JLabel(EnterDetails.securityNoField.getText());

        JLabel addressLabel = new JLabel("Owners address:");
        JLabel address = new JLabel(EnterDetails.addressField.getText());

        JLabel warrantyYearLabel = new JLabel("Warranty Year:");
        JLabel warrantyYear = new JLabel(EnterDetails.warrantyYearField.getText());
    JLabel carImageLabel = new JLabel("Car Image:");
        JLabel carImage = new JLabel(EnterDetails.imageLabel.getIcon());
        carImage.setSize(150,150);

        JButton serviceButton = new JButton("Display service records");
        serviceButton.setSize(50,50);
        serviceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ServiceRecordDetails serviceRecorddetails = new ServiceRecordDetails();
            }
        });
        JButton cancelButton = new JButton("Cancel");

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


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

        panel.add(l1);
        panel1.add(brandLabel);
        panel1.add(brandName);
        panel1.add(modelLabel);
        panel1.add(modelName);
        panel2.add(colorLabel);
        panel2.add(colorName);
        panel2.add(yearLabel);
        panel2.add(year);
        panel3.add(engineNoLabel);
        panel3.add(engineNo);
        panel3.add(seatsLabel);
        panel3.add(seats);
        panel4.add(licenseLabel);
        panel4.add(licenseNo);
        panel4.add(ownersNameLabel);
        panel4.add(ownerName);
        panel5.add(telephoneNoLabel);
        panel5.add(telephoneNo);
        panel5.add(emailLabel);
        panel5.add(email);
        panel6.add(driverLicenseLabel);
        panel6.add(drivingLicenseNo);
        panel6.add(securityNoLabel);
        panel6.add(securityNo);
        panel7.add(addressLabel);
        panel7.add(address);
        panel7.add(warrantyYearLabel);
        panel7.add(warrantyYear);
        panel8.add(carImageLabel);
        panel8.add(carImage);
        panel9.add(serviceButton);
        panel9.add(cancelButton);
        frame.setVisible(true);
    }
}
