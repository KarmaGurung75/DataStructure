public class insert_delettion {
//--------------------insertion
static int n=0;
   static int [] a=new int[6];
    insert_delettion(){
        for(int i = 0; i<5; i++){n++;
        a[i] =n;
        }
    }
    public void insAtAnyPos(int data,int pos){
      for(int i=n-1;i>=pos-1;i--){
            a[i+1]=a[i];
        }
        a[pos-1]=data;
        n++;
    }

    public static void main (String [] args) {
        insert_delettion s=new insert_delettion();

        System.out.println("printing old values");
        for(int i =0; i<n;i++){
            System.out.println(a[i]);
        }
        s.insAtAnyPos(8,3);

        System.out.println("printing new values after insert");
        for(int i =0; i<n;i++) {
            System.out.println(a[i]);
        }

    }
}

//----------------------------------- Delettion
