
package users;

import admins.updateUser;
import config.dbConnector;
import java.awt.Color;
import transition.TransitionsForm;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class bookedFlights extends TransitionsForm {

    public bookedFlights() {
        initComponents();
        init();
        searchFlights();
    }
    
    private void init (){
        todayFlight.fixTable(scrollPaneWin111);
    }
    
    public void searchFlights(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT Id, Departure, Arrival, Status, Price FROM flights_table");
            todayFlight.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM users_table");
            todayFlight.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new panelRoundComponents.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        FlyingTo = new javax.swing.JTextField();
        departure = new javax.swing.JTextField();
        Return = new javax.swing.JTextField();
        departureDate = new javax.swing.JTextField();
        returnAirTickets = new designComponents.Combobox();
        searchFlight = new panelRoundComponents.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roundPanel1 = new panelRoundComponents.RoundPanel();
        scrollPaneWin111 = new scrollPane.ScrollPaneWin11();
        todayFlight = new table.Table();
        selectButton = new panelRoundComponents.PanelRound();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back-forth-gif.gif"))); // NOI18N

        FlyingTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FlyingTo.setForeground(new java.awt.Color(153, 153, 153));
        FlyingTo.setText("  To");
        FlyingTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        FlyingTo.setPreferredSize(new java.awt.Dimension(6, 30));
        FlyingTo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FlyingToFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FlyingToFocusLost(evt);
            }
        });

        departure.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        departure.setForeground(new java.awt.Color(153, 153, 153));
        departure.setText("  From");
        departure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        departure.setPreferredSize(new java.awt.Dimension(6, 30));
        departure.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                departureFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                departureFocusLost(evt);
            }
        });
        departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureActionPerformed(evt);
            }
        });

        Return.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Return.setForeground(new java.awt.Color(130, 130, 130));
        Return.setText("  Return");
        Return.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Return.setPreferredSize(new java.awt.Dimension(6, 30));
        Return.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ReturnFocusLost(evt);
            }
        });
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        departureDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        departureDate.setForeground(new java.awt.Color(130, 130, 130));
        departureDate.setText("  Departure Date");
        departureDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        departureDate.setPreferredSize(new java.awt.Dimension(6, 30));
        departureDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                departureDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                departureDateFocusLost(evt);
            }
        });
        departureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureDateActionPerformed(evt);
            }
        });

        returnAirTickets.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "One Way", "Round Trip" }));
        returnAirTickets.setSelectedIndex(-1);
        returnAirTickets.setLabeText("return air tickets");
        returnAirTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnAirTicketsMouseClicked(evt);
            }
        });
        returnAirTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnAirTicketsActionPerformed(evt);
            }
        });

        searchFlight.setBackground(new java.awt.Color(91, 164, 252));
        searchFlight.setRoundBottomLeft(10);
        searchFlight.setRoundBottomRight(10);
        searchFlight.setRoundTopLeft(10);
        searchFlight.setRoundTopRight(10);
        searchFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFlightMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchFlightMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchFlightMouseReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Search Flight");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-flight.png"))); // NOI18N

        javax.swing.GroupLayout searchFlightLayout = new javax.swing.GroupLayout(searchFlight);
        searchFlight.setLayout(searchFlightLayout);
        searchFlightLayout.setHorizontalGroup(
            searchFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchFlightLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        searchFlightLayout.setVerticalGroup(
            searchFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(returnAirTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(FlyingTo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(departureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(searchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(returnAirTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FlyingTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(departureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(searchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setRound(20);

        scrollPaneWin111.setBorder(null);

        todayFlight.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        todayFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                " Airline", " Departure", " Arrival", " Status", " Fare", " Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        todayFlight.setShowVerticalLines(false);
        scrollPaneWin111.setViewportView(todayFlight);

        selectButton.setBackground(new java.awt.Color(91, 164, 252));
        selectButton.setToolTipText("Add");
        selectButton.setRoundBottomLeft(10);
        selectButton.setRoundBottomRight(10);
        selectButton.setRoundTopLeft(10);
        selectButton.setRoundTopRight(10);
        selectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                selectButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                selectButtonMouseReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select");

        javax.swing.GroupLayout selectButtonLayout = new javax.swing.GroupLayout(selectButton);
        selectButton.setLayout(selectButtonLayout);
        selectButtonLayout.setHorizontalGroup(
            selectButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );
        selectButtonLayout.setVerticalGroup(
            selectButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FlyingToFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FlyingToFocusGained
        if (FlyingTo.getText().equals("  To")){
            FlyingTo.setText("");
            FlyingTo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_FlyingToFocusGained

    private void FlyingToFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FlyingToFocusLost
        if (FlyingTo.getText().equals("")){
            FlyingTo.setText("  To");
            FlyingTo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_FlyingToFocusLost

    private void departureFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departureFocusGained
        if (departure.getText().equals("  From")){
            departure.setText("");
            departure.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_departureFocusGained

    private void departureFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departureFocusLost
        if (departure.getText().equals("")){
            departure.setText("  From");
            departure.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_departureFocusLost

    private void departureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureActionPerformed
        
    }//GEN-LAST:event_departureActionPerformed

    private void ReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReturnFocusGained
        if (Return.getText().equals("  Return")){
            Return.setText("");
            Return.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ReturnFocusGained

    private void ReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReturnFocusLost
        if (Return.getText().equals("")){
            Return.setText("  Return");
            Return.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ReturnFocusLost

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        
    }//GEN-LAST:event_ReturnActionPerformed

    private void departureDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departureDateFocusGained
        if (departureDate.getText().equals("  Departure Date")){
            departureDate.setText("");
            departureDate.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_departureDateFocusGained

    private void departureDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departureDateFocusLost
        if (departureDate.getText().equals("")){
            departureDate.setText("  Departure Date");
            departureDate.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_departureDateFocusLost

    private void departureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureDateActionPerformed

    private void returnAirTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnAirTicketsMouseClicked
        
    }//GEN-LAST:event_returnAirTicketsMouseClicked

    private void returnAirTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnAirTicketsActionPerformed
        if (returnAirTickets.getSelectedItem().equals("One Way")){
            Return.setVisible(false);
        } else {
            Return.setVisible(true);   
        }
    }//GEN-LAST:event_returnAirTicketsActionPerformed

    private void searchFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFlightMouseClicked
        
    }//GEN-LAST:event_searchFlightMouseClicked

    private void searchFlightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFlightMousePressed
        searchFlight.setBackground(new Color(88,151,238));
    }//GEN-LAST:event_searchFlightMousePressed

    private void searchFlightMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFlightMouseReleased
        searchFlight.setBackground(new Color(91,164,252));
    }//GEN-LAST:event_searchFlightMouseReleased

    private void selectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectButtonMouseClicked
        passengerDetails booking = new passengerDetails();
        booking.setVisible(true);
        
        int rowIndex = todayFlight.getSelectedRow();

        if (rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select row to update");
        } else{
            
            
            try {
                dbConnector dbc = new dbConnector();
                TableModel tbl = todayFlight.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM flights_table WHERE Id = '"+ tbl.getValueAt(rowIndex, 0) +"'");
                
                // password double hashing on updating users
                
                if (rs.next()){
                    //booking.uid.setText("" + rs.getInt("Id"));
                    booking.flightId = (rs.getInt("Id"));
                }
                
            } catch(SQLException ex){
                System.out.println(""+ ex);
            }
        }
    }//GEN-LAST:event_selectButtonMouseClicked

    private void selectButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectButtonMousePressed
        selectButton.setBackground(new Color(88,151,238));
    }//GEN-LAST:event_selectButtonMousePressed

    private void selectButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectButtonMouseReleased
        selectButton.setBackground(new Color(91,164,252));
    }//GEN-LAST:event_selectButtonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FlyingTo;
    private javax.swing.JTextField Return;
    private javax.swing.JTextField departure;
    private javax.swing.JTextField departureDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private panelRoundComponents.PanelRound panelRound1;
    private designComponents.Combobox returnAirTickets;
    private panelRoundComponents.RoundPanel roundPanel1;
    private scrollPane.ScrollPaneWin11 scrollPaneWin111;
    private panelRoundComponents.PanelRound searchFlight;
    private panelRoundComponents.PanelRound selectButton;
    private table.Table todayFlight;
    // End of variables declaration//GEN-END:variables
}
