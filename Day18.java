class main {
    int x ;
    main (int x)
    {
        this.x=x;
        System.out.println("Data " + x);
    }
    main(main s){
        x = s.x;
        System.out.println(+x);

    }
    public static void main(String[] args) {
        main obj = new main (10);
        main obj1 = new main  (10);
        
    }
}















































