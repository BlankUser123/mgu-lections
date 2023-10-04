class S2 {
    void m(S2 obj) {
        System.out.println("method is invoked " + obj.toString());
    }

    void p() {
        m(this);
    }

    public static void main(String[] args) {
        S2 s1 = new S2();
        s1.p();
    }
}