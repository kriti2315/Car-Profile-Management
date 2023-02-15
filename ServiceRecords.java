import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ServiceRecords  {
    public static ArrayList<ServiceRecordsEntries> list = new ArrayList<>();

    JFrame frame1 = new JFrame("service records");
    JLabel l1 = new JLabel("Please enter the service records");
    JPanel panel1 = new JPanel(new GridLayout());
    JPanel panel2 = new JPanel(new GridLayout());
    JPanel panel3 = new JPanel(new GridLayout());
    JPanel panel4 = new JPanel(new GridLayout());
    JPanel panel5 = new JPanel(new GridLayout());
    JPanel panel6 = new JPanel(new GridLayout(1,1,50,10));

    JLabel serviceNoLabel = new JLabel("Service No");
    JTextField serviceNoField = new JTextField(15);

    JLabel dateLabel = new JLabel("Service date");
    JTextField dateField = new JTextField(15);

    JLabel costLabel = new JLabel("Service Cost");
    JTextField costField = new JTextField(15);

    JLabel mileageLabel = new JLabel("Mileage");
    JTextField mileageField = new JTextField(15);

    JButton submitButton = new JButton("Submit");
    JButton cancelButton = new JButton("Cancel");

    ServiceRecords(){
        frame1.setSize(500,500);
        FlowLayout flow = new FlowLayout();
        frame1.setLayout(flow);
        flow.setVgap(20);
        submitButton.addActionListener(e -> {

            //check entries validation
            if(serviceNoField.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(frame1,"You must enter the service no ","Car profile management",JOptionPane.ERROR_MESSAGE);
                serviceNoField.requestFocus();
                return;
            }
            if(dateField.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(frame1,"You must enter the date ","Car profile management",JOptionPane.ERROR_MESSAGE);
                dateField.requestFocus();
                return;
            }
            if(costField.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(frame1,"You must enter the service cost ","Car profile management",JOptionPane.ERROR_MESSAGE);
                costField.requestFocus();
                return;
            }
            if(mileageField.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(frame1,"You must enter the service Mileage ","Car profile management",JOptionPane.ERROR_MESSAGE);
                mileageField.requestFocus();
                return;
            }
            //store service records
            ServiceRecordsEntries serviceRecordsEntries = new ServiceRecordsEntries(Integer.parseInt(serviceNoField.getText()),
                    dateField.getText(),Integer.parseInt(costField.getText()),Integer.parseInt(mileageField.getText()));
            list.add(serviceRecordsEntries);

            JOptionPane.showMessageDialog(frame1,"your details have been saved \n you can add more","submitted",JOptionPane.INFORMATION_MESSAGE);
            //empty the entries columns
            serviceNoField.setText("");
            dateField.setText("");
            costField.setText("");
            mileageField.setText("");
            serviceNoField.requestFocus();


        });
        cancelButton.addActionListener(e -> frame1.dispose());
        //add panels and entries to frame
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.add(panel3);
        frame1.add(panel4);
        frame1.add(panel5);
        frame1.add(panel6);

        panel1.add(l1);
        panel2.add(serviceNoLabel);
        panel2.add(serviceNoField);
        panel3.add(dateLabel);
        panel3.add(dateField);
        panel4.add(costLabel);
        panel4.add(costField);
        panel5.add(mileageLabel);
        panel5.add(mileageField);
        panel6.add(submitButton);
        panel6.add(cancelButton);
        frame1.setVisible(true);

    }
}
