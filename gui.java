import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
    String nama = "Ali Uraidhy Assagaf";
        int umur = 18;
        String alamat = "Jl. Pahlawan Revolusi No. 60, Ternate, Maluku Utara, Indonesia";
        
        // Plain message dialog
        JOptionPane.showMessageDialog(null, "Halo, nama saya " + nama + "!");
        
        // Information message dialog
        JOptionPane.showMessageDialog(null, "Saya berumur " + umur + " tahun. Saya tinggal di " + alamat, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        
        // Warning message dialog
        JOptionPane.showMessageDialog(null, "Awas Ali Menggigit", "Peringatan", JOptionPane.WARNING_MESSAGE);
        
        // Error message dialog
        JOptionPane.showMessageDialog(null, "KESALAHAN BERPIKIR!", "Error", JOptionPane.ERROR_MESSAGE);

        // Question message dialog
        int response = JOptionPane.showConfirmDialog(null, "Apakah kamu Ali?, Jika kamu ali pilih YA", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ya, saya Ali.");
        } else {
            JOptionPane.showMessageDialog(null, "Bukan, saya bukan Ali.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }

        // Input dialog
        String namaInput = JOptionPane.showInputDialog(null, "Masukkan nama kamu: ");
        JOptionPane.showMessageDialog(null, "Halo, " + namaInput + "!");
    }
}
