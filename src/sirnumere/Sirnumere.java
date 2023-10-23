package sirnumere;

public class Sirnumere {

    public static void main(String[] args){
        System.out.print("Numerele prime din sir sunt: ");
        int sir[]={11,6,7,9,13};
        for(int i=1;i<sir.length;i++){
            int ok=1;
            int j=2;
            while(sir[i]%j!=0 && j<sir[i]/2){
                j++;
            }
            if(sir[i]%j==0){
                ok=0;
            }
            if(ok==1){
                System.out.println(sir[i]);
            }
        }
    }
}
