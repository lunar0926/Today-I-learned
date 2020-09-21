public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control=new ControlLabel();
        control.printTimesTable();
    }
    public void printTimesTable() {
        
        for (int level=2; level<=9; level++) {
            // if(level==4) continue;
            for (int column=1; column<=9; column++) {
               //  if(column==4) continue;
               if (column==4) break;
               if(level==4 || column==4) continue;
                System.out.print(level+"*"+column+"="+level*column+" ");
            }
            if (level!=4) {
            System.out.println();
            }
        }
    }
}