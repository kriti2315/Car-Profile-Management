import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServiceRecordDetails {
    //declare frames and tables for showing service records
    JFrame frame1 = new JFrame("service records");
    DefaultTableModel dtm = new DefaultTableModel();
    JTable table = new JTable(dtm);
    JScrollPane sp = new JScrollPane(table);

    ServiceRecordDetails(){
        //display service records table
        frame1.setSize(500,500);
        frame1.setLayout(null);

        sp.setBounds(0,50,500,300);
        String arr[] = {"Service No","Service Date","Service Cost","Mileage"};
        for(int i=0;i<arr.length;i++){
            dtm.addColumn(arr[i]);
        }
        for(int i=0;i<ServiceRecords.list.size();i++){
            String values[] = {String.valueOf(ServiceRecords.list.get(i).ServiceNo),String.valueOf(ServiceRecords.list.get(i).ServiceDate),
                    String.valueOf(ServiceRecords.list.get(i).ServiceCost),String.valueOf(ServiceRecords.list.get(i).Mileage)};
            dtm.addRow(values);
        }

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(150,400,150,30);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.dispose();
            }
        });

        frame1.add(sp);
        frame1.add(cancelButton);
        frame1.setVisible(true);
    }
}
