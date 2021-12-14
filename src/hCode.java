class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @java.lang.Override
    public int hashCode() {
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
        if(varB != other.varB)
            return false;
        return true;
    }
}

class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox(15,20);
        BlackBox b2 = new BlackBox(15,20);

        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());
    }
}