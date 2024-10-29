class Prime_Number{
    public static void p(int a){
        for(int i=2;i<a;i++){
            boolean isprime=true;

            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){

                    isprime=false;
                    break;
                }
            }

        if(isprime){
            System.out.println(i+",");
        }
     }
    }
    public static void main(String[] args) {
        p(10);

    }
}

