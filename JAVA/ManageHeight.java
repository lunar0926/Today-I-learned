public class ManageHeight {
    int [][] gradeHeights = {{170, 180, 173, 175, 177}, {160, 165, 167, 186}, 
        {158, 177, 187, 176}, {173, 182, 181}, {170, 180, 165, 177, 172}};
    int oneLoop;
    int twoLoop;
    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        
        System.out.println("°á°ú");
        // manage.printHeight();
        int avg = 0;
        while(avg < 5) {
            manage.printAverage(avg);
            avg++;
        }
    }
    public void printHeight() {
        for(int oneLoop=0; oneLoop < 5; oneLoop++) {
            System.out.println("Class No.:"+ (oneLoop+1));
            for(int twoLoop=0; twoLoop < gradeHeights[oneLoop].length; twoLoop++) {
            System.out.println(gradeHeights[oneLoop][twoLoop]);
            }
        }
    }
    public void printAverage(int classNo) {
        double sum = 0;
        System.out.println("Class No.:"+(classNo+1));
        for(int loop = 0; loop < gradeHeights[classNo].length; loop++) {
            sum += gradeHeights[classNo][loop];
        }
        System.out.println("Height average:"+(sum / gradeHeights[classNo].length));
    }
}
