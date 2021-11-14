package CoreJavaAssignment2;
class database {
    private static database dbObject;
 
    private database() {      
    }
 
    public static database getInstance() {
 
       // create object if it's not already created
       if(dbObject == null) {
          dbObject = new database();
       }
 
        // returns the singleton object
        return dbObject;
    }
 
    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
 }
 
 class Q1 {
    public static void main(String[] args) {
       database db1;
 
       
       db1= database.getInstance();
       
       db1.getConnection();
    }
 }


