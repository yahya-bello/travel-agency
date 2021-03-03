
package project_sad;

/**
 *
 * @author HP
 */
public class Driver {
    
    private String name;
    private String nid;
    private String vehicle_no;
    private String phone;
    private String route;
    private String total_cust;
    private String total_amt;
    
    public Driver(String name,String nid,String v_no,String phone,String route,String tcust,String tamt){
        
        this.name = name;
        this.nid = nid;
        this.vehicle_no = v_no;
        this.phone = phone;
        this.route =route;
        this.total_cust = tcust;
        this.total_amt = tamt;
    }
    
    public String getname(){return name;}
     public String getnid(){return nid;}
     public String getv_no(){return vehicle_no;}
      public String getphone(){return phone;}
       public String getroute(){return route;}
        public String gettot_cust(){return total_cust;}
         public String gettotamt(){return total_amt;}     
}
