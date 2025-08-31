package naukridsa;

class SuperConstructor {
    public static void main(String[] args) {
        employee e = new employee();
    }
}

class Bank {
    Bank() {
        System.out.println("calling constructor...  from parent");
    }
}

class employee extends Bank {
    employee() {
        super();
    }
}