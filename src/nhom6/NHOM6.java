/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhom6;

/**
 *
 * @author adminh
 */
public class NHOM6 {
    DBConnection dBConnection;
     
    public ArrayList<DanhMuc> getList(){
        String sql = "select * from danh_muc dm" ;
        ArrayList<DanhMuc> reslut = new ArrayList<>();
        try(Connection conn = dBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql))
        {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Integer id = rs.getInt("id");
                System.out.println("\nid la : "+id);
                String ma_danh_muc = rs.getString("ma_danh_muc");
                System.out.println("Ma la : "+ma_danh_muc);
                String ten_danh_muc = rs.getString("ten_danh_muc");
                System.out.println("Ten la : "+ten_danh_muc);
                String trang_thai = rs.getString("trang_thai");
                System.out.println("Trang thai la : "+trang_thai);
                Date ngay_tao = rs.getDate("ngay_tao");
                System.out.println("Ngay tao la : "+ngay_tao):
                                  
                Date ngay_sua = rs.getDate("ngay_tao");
                System.out.println("Ngay sua la : "+ngay_sua);
            }
        }    
        catch (Exception e) {
            e.printStackTrace();
        }
        return reslut;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
