package ChapsStart;

class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }


    public int hashCoded() {
        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }

    @java.lang.Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        BlackBox other = (BlackBox) obj;
        if (varA != other.varA)
            return false;
        return varB == other.varB;
    }
}

class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox(12,20);
        BlackBox b2 = new BlackBox(15,20);
        BlackBox b3 = new BlackBox(1,20);
        BlackBox b4 = new BlackBox(5,20);
        BlackBox b5 = new BlackBox(4,20);
        BlackBox b6 = new BlackBox(6,20);
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b4.hashCode());
        System.out.println(b5.hashCode());
        System.out.println(b6.hashCode());
    }
}