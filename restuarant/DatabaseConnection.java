package restuarant;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DatabaseConnection {

    private Connection getConnection(String dbName, String user, String pass) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/" + dbName + "?useUnicode=true&characterEncoding=utf-8", user, pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;

    }

    public String getIncomeData(String date) {
        String query = "Select SUM(Balance) as Balance from income_expense where DATE(Date) = DATE(?) and type = 0";
        String incomeData = "";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, date);
            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    incomeData = result.getString("Balance");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return incomeData;
    }

    public String getExpenseData(String date) {
        String query = "Select SUM(Balance) as Balance from income_expense where DATE(Date) = DATE(?) and type = 1";
        String expenseData = "";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, date);
            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    expenseData = result.getString("Balance");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenseData;
    }

    public String[] getUser(String user, String pass) {
        String[] data = new String[4];
        String query = "Select EmpID, Name, Username, Password from employee where Username = ?  and Password = ?";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, user);
            stm.setString(2, pass);
            try ( ResultSet result = stm.executeQuery();) {
                while (result.next()) {
                    String id = result.getString("EmpID");
                    String name = result.getString("Name");
                    String username = result.getString("Username");
                    String password = result.getString("Password");

                    data[0] = id;
                    data[1] = name;
                    data[2] = username;
                    data[3] = password;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
    
    public ArrayList <String> getUsername(){
        String query = "Select Username from employee";
        ArrayList <String> list = new ArrayList<>();
        
        try (Connection con = getConnection("restuarant", "root", "")){
            try (PreparedStatement stm = con.prepareStatement(query)){
                try (ResultSet result = stm.executeQuery()){
                    while (result.next()){
                        list.add(result.getString("Username"));
                    }
                }
            }
        } catch (SQLException e) { e.printStackTrace(); }
        
        return list;
    }

    public void getAccountingToTable(JTable table) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String[] data = new String[7];
        String query = "Select  income_expense.TID, employee.`Name`,DATE_FORMAT(income_expense.Date, '%d-%m-%Y %H:%i') as Date, income_expense.Type, income_expense.Balance, income_expense.Detail from"
                + " income_expense INNER JOIN employee ON income_expense.EmpID = employee.EmpID ORDER BY DATE(Date) DESC";

        try ( Connection con = getConnection("restuarant", "root", "");) {
            PreparedStatement stm = con.prepareStatement(query);

            try ( ResultSet result = stm.executeQuery(query)) {
                while (result.next()) {
                    String id = result.getString("TID");
                    String empName = result.getString("Name");
                    String date = result.getString("Date");
                    String type = result.getString("Type");
                    String balance = result.getString("Balance");
                    String detail = result.getString("Detail");

                    if (type.equals("0")) {
                        data[0] = id;
                        data[1] = empName;
                        data[2] = date;
                        data[3] = type;
                        data[4] = balance;
                        data[5] = "";
                        data[6] = detail;
                    } else if (type.equals("1")) {
                        data[0] = id;
                        data[1] = empName;
                        data[2] = date;
                        data[3] = type;
                        data[4] = "";
                        data[5] = balance;
                        data[6] = detail;
                    }
                    dt.addRow(data);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAccountingToTable(JTable table, String date) {
        String[] data = new String[7];
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String query = "Select  income_expense.TID, employee.`Name`, DATE_FORMAT(income_expense.Date, '%d-%m-%Y %H:%i') as Date, income_expense.Type,"
                + " income_expense.Balance, income_expense.Detail from"
                + " income_expense INNER JOIN employee ON income_expense.EmpID = employee.EmpID where DATE(Date) = DATE(?)";
        try ( Connection con = getConnection("restuarant", "root", "");) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, date);

            try ( ResultSet result = stm.executeQuery();) {
                while (result.next()) {
                    String id = result.getString("TID");
                    String empName = result.getString("Name");
                    String accountingDate = result.getString("Date");
                    String type = result.getString("Type");
                    String balance = result.getString("Balance");
                    String detail = result.getString("Detail");

                    if (type.equals("0")) {
                        data[0] = id;
                        data[1] = empName;
                        data[2] = accountingDate;
                        data[3] = type;
                        data[4] = balance;
                        data[5] = "";
                        data[6] = detail;
                    } else if (type.equals("1")) {
                        data[0] = id;
                        data[1] = empName;
                        data[2] = accountingDate;
                        data[3] = type;
                        data[4] = "";
                        data[5] = balance;
                        data[6] = detail;
                    }
                    dt.addRow(data);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getSupplierToTable(JTable table) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String query = "Select SupplierID, Company, ContactPersonName, Address, Tel  From supplier Order By Company ASC";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    String id = result.getString("SupplierID");
                    String company = result.getString("Company");
                    String contactName = result.getString("ContactPersonName");
                    String address = result.getString("Address");
                    String tel = result.getString("Tel");

                    String[] data = {id, company, contactName, address, tel};
                    dt.addRow(data);
                }
            }
        } catch (SQLException e) {
        }
    }

    public void getMaterialDataToTable(JTable table) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String query = "Select MaterialID as ID, MaterialName as Name, MaterialPrice as Price, MaterialAmount as Amount, UnitOfMeasure as Unit, Detail from material order by Name";
        try ( Connection con = getConnection("restuarant", "root", "");) {
            PreparedStatement stm = con.prepareStatement(query);
            try ( ResultSet result = stm.executeQuery();) {
                while (result.next()) {
                    String id = result.getString("ID");
                    String name = result.getString("Name");
                    String price = result.getString("Price");
                    String amount = result.getString("Amount");
                    String unit = result.getString("Unit");
                    String detail = result.getString("Detail");

                    String[] data = {id, name, amount, unit, price, detail};
                    dt.addRow(data);
                }
            }
        } catch (SQLException e) {
        }
    }

    public void getRemainingMaterialDataToTable(JTable table) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String query = "Select MaterialID as ID, MaterialName as name, MaterialPrice as price, MaterialAmount as amount, UnitOfMeasure as unit from material order by name DESC";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            try ( ResultSet result = stm.executeQuery();) {
                while (result.next()) {
                    String id = result.getString("ID");
                    String name = result.getString("name");
                    String price = result.getString("price");
                    String amount = result.getString("amount");
                    String unit = result.getString("unit");

                    String[] data = {id, name, price, amount, unit};
                    dt.addRow(data);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getRemainingMaterialDataToTable(JTable table, String Mname) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String query = "Select MaterialID as ID, MaterialName as name, MaterialPrice as price, MaterialAmount as amount, UnitOfMeasure as unit from material where MaterialName = ? order by name DESC";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, Mname);
            try ( ResultSet result = stm.executeQuery();) {
                while (result.next()) {
                    String id = result.getString("ID");
                    String name = result.getString("name");
                    String price = result.getString("price");
                    String amount = result.getString("amount");
                    String unit = result.getString("unit");

                    String[] data = {id, name, price, amount, unit};
                    dt.addRow(data);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getOrderDataToTable(JTable table) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String query = "Select `order`.OrderID, employee.`Name`, supplier.Company, supplier.ContactPersonName, DATE_FORMAT(`order`.Date, '%d-%m-%Y %H:%i') as Date,"
                + " DATE_FORMAT(receiveMaterial.DateReceive, '%d-%m-%Y %H:%i') as DateReceive,"
                + " `order`.Total from `order` INNER JOIN employee ON `order`.EmpID = employee.EmpID "
                + "INNER JOIN receiveMaterial ON receiveMaterial.OrderID = `order`.OrderID  " + "INNER JOIN supplier ON `order`.SupplierID = supplier.SupplierID ORDER BY DATE(Date) DESC";

        try ( Connection con = getConnection("restuarant", "root", "");) {
            PreparedStatement stm = con.prepareStatement(query);
            try ( ResultSet result = stm.executeQuery();) {
                while (result.next()) {
                    String orderID = result.getString("OrderID");
                    String empName = result.getString("Name");
                    String compName = result.getString("Company");
                    String compEmp = result.getString("ContactPersonName");
                    String orderDate = result.getString("Date");
                    String recieveDate = result.getString("DateReceive");
                    String totalOrder = result.getString("Total");

                    String[] data = {orderID, empName, compName, compEmp, orderDate, recieveDate, totalOrder};

                    dt.addRow(data);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getOrderDataToTable(JTable table, String date) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String query = "Select `order`.OrderID, employee.`Name`, supplier.Company, supplier.ContactPersonName,DATE_FORMAT(`order`.Date, '%d-%m-%Y %H:%i') as Date, "
                + "DATE_FORMAT(receiveMaterial.DateReceive, '%d-%m-%Y %H:%i') as DateReceive"
                + ", `order`.Total from `order` INNER JOIN employee ON `order`.EmpID = employee.EmpID "
                + "INNER JOIN receiveMaterial ON receiveMaterial.OrderID = `order`.OrderID  " + "INNER JOIN supplier ON `order`.SupplierID = supplier.SupplierID where DATE(Date) = DATE(?)";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, date);
            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    String orderID = result.getString("OrderID");
                    String empName = result.getString("Name");
                    String compName = result.getString("Company");
                    String compEmp = result.getString("ContactPersonName");
                    String orderDate = result.getString("Date");
                    String recieveDate = result.getString("DateReceive");
                    String totalOrder = result.getString("Total");

                    String[] data = {orderID, empName, compName, compEmp, orderDate, recieveDate, totalOrder};

                    dt.addRow(data);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getOrderDetailDataToTable(JTable table, String orderId) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String [] list = new String[6];
        String query = "Select orderDetails.OrderID, orderDetails.MaterialID, material.MaterialName, orderDetails.Unit,"
                + " material.UnitOfMeasure, orderDetails.`Status`from orderDetails INNER JOIN material ON orderDetails.MaterialID = material.MaterialID WHERE OrderID = ? ";
        String id = orderId;

        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, id);

            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    String orderID = result.getString("OrderID");
                    String mID = result.getString("MaterialID");
                    String mName = result.getString("MaterialName");
                    String amount = result.getString("Unit");
                    String measure = result.getString("UnitOfMeasure");
                    String status = result.getString("Status");
                    String statusText = "";

                    if (status.equals("0")) {
                        statusText = "ยังไม่ได้รับ";
                    } else {
                        statusText = "ได้รับเรียบร้อย";
                    }
                    
                    list[0] = orderID;
                    list[1] = mID;
                    list[2] = mName;
                    list[3] = amount;
                    list[4] = measure;
                    list[5] = statusText;
                    dt.addRow(list);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> getOrderDetailData(String orderID) {
        ArrayList<String> list = new ArrayList<>();
        String query = "SELECT employee.`Name` as empName, supplier.Company, supplier.ContactPersonName as contactName, DATE_FORMAT(`order`.Date, '%d-%m-%Y %H:%i') as Date "
                + "from `order` inner join employee ON `order`.EmpID = employee.EmpID "
                + "inner join supplier on `order`.SupplierID = supplier.SupplierID where OrderID = ?";

        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, orderID);

            try (ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    String empName = result.getString("empName");
                    String company = result.getString("Company");
                    String contactName = result.getString("contactName");
                    String date = result.getString("Date");
                    
                   list.add(empName);
                   list.add(company);
                   list.add(contactName);
                   list.add(date);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<String> getOrderAndReceiveDetail(String orderID){
        ArrayList <String> list = new ArrayList<>();
        String query = "Select employee.`Name`as empName, supplier.Company, supplier.ContactPersonName as contactName, DATE_FORMAT(`order`.Date, '%d-%m-%Y %H:%i') as orderDate, "
                + "DATE_FORMAT(receivematerial.DateReceive, '%d-%m-%Y %H:%i') as receiveDate from `order`"
                + "Inner join receivematerial ON receivematerial.OrderID = `order`.OrderID " + " Inner Join employee On `order`.EmpID = employee.EmpID and receivematerial.EmpID = employee.EmpID " 
                + "Inner join supplier On `order`.SupplierID = supplier.SupplierID where `order`.OrderID = ?";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, orderID);
            
            try (ResultSet result = stm.executeQuery()){
                while (result.next()){
                    String empName = result.getString("empName");
                    String company = result.getString("Company");
                    String contactName = result.getString("contactName");
                    String orderDate = result.getString("orderDate");
                    String receiveDate = result.getString("receiveDate");
                    
                    list.add(empName);
                   list.add(company);
                   list.add(contactName);
                   list.add(orderDate);
                   list.add(receiveDate);
                }
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }

    public String getSupplierID(String company, String name) {
        String id = "";
        String query = "Select SupplierID from supplier where company = ? and ContactPersonName = ?";

        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, company);
            stm.setString(2, name);
            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    id = result.getString("SupplierID");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }

    public void getSupplierCompany(JComboBox box) {
        DefaultComboBoxModel cm = (DefaultComboBoxModel) box.getModel();
        ArrayList<String> list = new ArrayList<>();
        String query = "Select DISTINCT(Company) as company from supplier";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    String name = result.getString("company");
                    list.add(name);
                }
            }
            cm.addAll(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getSuplierName(String company, JComboBox box) {
        DefaultComboBoxModel cm = (DefaultComboBoxModel) box.getModel();
        ArrayList<String> list = new ArrayList<>();
        String query = "Select ContactPersonName as name from supplier where Company = ?";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, company);
            try ( ResultSet result = stm.executeQuery()) {
                while (result.next()) {
                    String name = result.getString("name");
                    list.add(name);
                }
            }
            cm.addAll(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void getEmployeeDataToTable(JTable table){
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        String [] list = new String[6];
        String query = "Select EmpID, Prefix, Name, LastName, DATE_FORMAT(BirthDay, '%d-%m-%Y') as dob, Phone from employee";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            PreparedStatement stm = con.prepareStatement(query);
            
            try (ResultSet result = stm.executeQuery()){
                while (result.next()){
                    String id = result.getString("EmpID");
                    String prefix = result.getString("Prefix");
                    String name = result.getString("Name");
                    String lastName = result.getString("lastName");
                    String dob = result.getString("dob");
                    String tel = result.getString("Phone");
                    list[0] = id;
                    list[1] = prefix;
                    list[2] = name;
                    list[3] = lastName;
                    list[4] = dob;
                    list[5] = tel;
                    
                    dt.addRow(list);
                }
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
    
    public ArrayList <String> getEmployeeDataDetail(String empID){
        String query = "Select Prefix, Name, LastName, Username, Password, DATE_FORMAT(Birthday, '%d-%m-%Y') as Birthday, DATE_FORMAT(StartDay, '%d-%m-%Y') as StartDay, IDCard, Phone , Address from employee where EmpID = ?";
        ArrayList <String> data = new ArrayList<>();
        
        try (Connection con = getConnection("restuarant", "root", "")){
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, empID);
            
            try (ResultSet result = stm.executeQuery()){
                while (result.next()){
                    String prefix = result.getString("Prefix");
                    String name = result.getString("Name");
                    String lastName = result.getString("LastName");
                    String userName = result.getString("Username");
                    String passWord = result.getString("Password");
                    String birthDate = result.getString("Birthday");
                    String startDate = result.getString("StartDay");
                    String id = result.getString("IDCard");
                    String phone = result.getString("Phone");
                    String address = result.getString("Address");
                    
                    data.add(prefix);
                    data.add(name);
                    data.add(lastName);
                    data.add(userName);
                    data.add(passWord);
                    data.add(birthDate);
                    data.add(startDate);
                    data.add(id);
                    data.add(phone);
                    data.add(address);
                }
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return data;
    }

    public void insertAccountingData(String empID, String date, int type, String balance, String detail) {
        String insertQuery = "Insert into income_expense (EmpID, Date, Type, Balance, Detail) values(?, STR_TO_DATE(?, '%Y-%m-%dT%H:%i:%s') , ? , ? , ?)";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            try ( PreparedStatement stm = con.prepareStatement(insertQuery);) {
                stm.setInt(1, Integer.parseInt(empID));
                stm.setString(2, date);
                stm.setInt(3, type);
                stm.setString(4, balance);
                stm.setString(5, detail);
                stm.executeUpdate();
            }
        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insertAccountingData(String empID, String date, String balance, String detail){
        String query = "Insert into income_expense (EmpID, Date, Balance, Detail, type) values (?, STR_TO_DATE(?, '%Y-%m-%dT%H:%i:%s'), ?, ?, 1)";
        
        try (Connection con = getConnection("restuarant", "root" ,"")){
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, empID);
            stm.setString(2, date);
            stm.setString(3, balance);
            stm.setString(4, detail);
            
            stm.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void insertMaterialData(String name, String amount, String price, String unit, String detail) {
        String query = "Insert into material (MaterialName, MaterialPrice , MaterialAmount, UnitOfMeasure, Detail) values(?, ?, ?, ?, ?)";
        try ( Connection con = getConnection("restuarant", "root", "");) {
            try ( PreparedStatement stm = con.prepareStatement(query);) {
                stm.setString(1, name);
                stm.setString(2, price);
                stm.setString(3, amount);
                stm.setString(4, unit);
                stm.setString(5, detail);

                stm.executeUpdate();
            }
        } catch (SQLException e) {
        }
    }

    public void insertOrderData(String empId, String supplierId, String date, ArrayList<String> mID, ArrayList<String> mAmount) {
        long orderId = 0;
        String query = "Insert into `order` (EmpID, SupplierID, Date, Total) values(?, ?, STR_TO_DATE(?, '%Y-%m-%dT%H:%i:%s'), 0)";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            PreparedStatement stm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, empId);
            stm.setString(2, supplierId);
            stm.setString(3, date);
            stm.executeUpdate();
            try ( ResultSet genId = stm.getGeneratedKeys()) {
                if (genId.next()) {
                    orderId = genId.getLong(1);
                }
            }

            query = "Insert into orderDetails (OrderID, MaterialID, unit, Status) values (?, ?, ?, 0)";
            stm = con.prepareStatement(query);
            for (int i = 0; i < mID.size(); i++) {
                stm.setString(1, Long.toString(orderId));
                stm.setString(2, mID.get(i));
                stm.setString(3, mAmount.get(i));
                stm.addBatch();
            }

            int[] insertCount = stm.executeBatch();
            int orderAmount = 0;
            for (int i = 0; i < insertCount.length; i++) {
                orderAmount += insertCount[i];
            }

            query = "Update `order` set Total = ? where OrderID = ?";
            stm = con.prepareStatement(query);

            stm.setString(1, Integer.toString(orderAmount));
            stm.setString(2, Long.toString(orderId));
            stm.executeUpdate();

            query = "Insert into receiveMaterial (OrderID) values (?)";
            stm = con.prepareStatement(query);
            stm.setString(1, Long.toString(orderId));
            stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertReceiveData(String orderID, String date, String empID, ArrayList <String> mID, ArrayList <String> mAmount){
        long receiveID = 0;
        String query = "Update receiveMaterial set DateReceive = STR_TO_DATE(?, '%Y-%m-%dT%H:%i:%s'), EmpID = ? where OrderID = ?";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            PreparedStatement stm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            con.setAutoCommit(false);
            stm.setString(1,date);
            stm.setString(2,empID);
            stm.setString(3, orderID);
            stm.executeUpdate();
            
            query = "Select ReceiveID from receiveMaterial where OrderID = ?";
            stm = con.prepareStatement(query);
            stm.setString(1, orderID);
            try (ResultSet result = stm.executeQuery()){
                while (result.next()){
                    receiveID = result.getLong("ReceiveID");
                }
            }
            
            query = "Insert into receiveMaterialDetail (ReceiveID, MaterialID, Unit) values(?, ?, ?)";
            stm = con.prepareStatement(query);       
            stm.setString(1, Long.toString(receiveID));
            for (int i = 0; i < mID.size(); i++){           
                stm.setString(2, mID.get(i));
                stm.setString(3, mAmount.get(i));
                
            }
            stm.addBatch();         
            stm.executeBatch();
            
            query = "Update orderDetails set status = 1 where OrderID = ?";
            stm = con.prepareStatement(query);   
            stm.setString(1, orderID);
            stm.executeUpdate();
            
            query = "Update material set MaterialAmount = MaterialAmount + ? where MaterialID = ?";
            stm = con.prepareStatement(query);
            for (int i = 0; i < mAmount.size(); i++){
                stm.setInt(1, Integer.parseInt(mAmount.get(i)));
                stm.setString(2, mID.get(i));
            }
            
            stm.executeBatch();
            
            con.commit();
            
        } catch (SQLException e) { e.printStackTrace(); }
    }
    
    public void insertSupplierData(String company, String name, String tel, String address){
        String query = "Insert Into supplier (Company, ContactPersonName, Tel, Address) values (?, ?, ?, ?)";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            try (PreparedStatement stm = con.prepareStatement(query)){
                stm.setString(1, company);
                stm.setString(2, name);
                stm.setString(3, tel);
                stm.setString(4, address);
                stm.executeUpdate();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
    
    public void insertEmployeeData(String [] data){
        String query = "Insert into employee (Username, password, Prefix, Name, LastName, IDCard, Phone, Address, BirthDay, StartDay) values (?, ?, ?, ?, ?, ?, ?, ?, STR_TO_DATE(?, '%Y-%m-%dT%H:%i:%s'), STR_TO_DATE(?, '%Y-%m-%dT%H:%i:%s'))";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            PreparedStatement stm = con.prepareStatement(query);
            for (int i = 0; i < data.length; i++){
                stm.setString(i + 1,data[i]);
            }
            stm.executeUpdate();
        } catch (SQLException e){ e.printStackTrace(); }
    }
    
    public void updateAccountingData(String ID, String date, String type, String balance, String detail) {
        String updateQuery = "Update income_expense set Date = STR_TO_DATE(?, '%d-%m-%Y %H:%i'),  Type = ?, Balance = ?, Detail =  ? where TID = ?";
        try ( Connection con = getConnection("restuarant", "root", "")) {
            try ( PreparedStatement stm = con.prepareStatement(updateQuery);) {
                stm.setString(1,date);
                stm.setInt(2, Integer.parseInt(type));
                stm.setDouble(3, Double.parseDouble(balance));
                stm.setString(4, detail);
                stm.setInt(5, Integer.parseInt(ID));

                stm.executeUpdate();
            }
        } catch (NumberFormatException | SQLException e) {
        }
    }

    public void updateMaterialData(String ID, String name, String price, String unit, String detail) {
        String query = "Update material set MaterialName = ?, MaterialPrice = ?, UnitOfMeasure = ?, Detail = ? where MaterialID = ?";
        try ( Connection con = getConnection("restuarant", "root", "");) {
            try ( PreparedStatement stm = con.prepareStatement(query);) {
                stm.setString(1, name);
                stm.setString(2, price);
                stm.setString(3, unit);
                stm.setString(4, detail);
                stm.setString(5, ID);

                stm.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateOrderDetailData(String orderID, String mID,String amount){
        String query = "Update orderDetails set Unit = ? where OrderID = ? and MaterialID = ?";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            try(PreparedStatement stm = con.prepareStatement(query)){
                stm.setString(1, amount);
                stm.setString(2, orderID);
                stm.setString(3, mID);
                stm.executeUpdate();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
    
    public void updateOrderAmount(String orderID, int amount){
        String query = "Update `order` set Total = ? where OrderID = ?";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            try (PreparedStatement stm = con.prepareStatement(query)){
                stm.setString(1, Integer.toString(amount));
                stm.setString(2, orderID);
                stm.executeUpdate();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
    
    public void updateSupplierData(String id, String comp, String name, String tel, String address){
        String query = "Update supplier set Company = ?, ContactPersonName = ?, Tel = ?, Address = ? where SupplierID = ?";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            try (PreparedStatement stm = con.prepareStatement(query)){
                stm.setString(1, comp);
                stm.setString(2,name);
                stm.setString(3,tel);
                stm.setString(4, address);
                stm.setString(5, id);
                stm.executeUpdate();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
    
    public void updateEmployeeData(String [] data, String empID){
        String query = "Update employee set Prefix = ?, Name = ?, LastName = ?, Password = ?, "
                + "Birthday = STR_TO_DATE(?, '%d-%m-%Y'), StartDay = STR_TO_DATE(?, '%d-%m-%Y'), IDCard = ?, Phone = ?, Address = ? Where EmpID = ?";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            PreparedStatement stm = con.prepareStatement(query);
            for (int i = 0; i < data.length; i++){
                stm.setString(i +1, data[i]);
            }
            stm.setString(10, empID);
            stm.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
    
    public void deleteOrderDetailData(String orderID, String mID){
        String query = "Delete from orderDetails where OrderID = ? and MaterialID = ?";
        
        try (Connection con = getConnection("restuarant", "root", "")){
            try (PreparedStatement stm = con.prepareStatement(query)){
                stm.setString(1, orderID);
                stm.setString(2, mID);
                stm.executeUpdate();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
