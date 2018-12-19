public class Pokupatel {
    String fio;
    String login;
    String adress;

    public Pokupatel(String fio, String login, String adress) {
        this.fio = fio;
        this.login = login;
        this.adress = adress;
    }

    Order[] o = new Order[1];

    class Order {
        double konechnayaStoimost;
        String data;
        boolean orderComplited;

        public Order(double konechnayaStoimost, String data, boolean orderComplited) {
            this.konechnayaStoimost = konechnayaStoimost;
            this.data = data;
            this.orderComplited = orderComplited;
        }

        Tovar[] t = new Tovar[1];
    }

        class Tovar {
            int productID;
            String productName;
            int kolvo;
            double price;

            public Tovar(int productID, String productName, int kolvo, double price) {
                this.productID = productID;
                this.productName = productName;
                this.kolvo = kolvo;
                this.price = price;
            }
        }
    Tovar tovar = new Tovar(23, "Kaktus", 2, 200);
    Order order = new Order(400, "01-01-2019", true);
    }
