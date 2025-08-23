# Fonksiyonlar 

***Customer Service***
- 1)  public void add(Customer customer);
Kullanıcı ekleme işlemini gerçekleştirir. 

- 2) public void search(String name);
Kullanıcı arama işlemini gerçekleştirir.


 ***Product Service***
- 1) public void add(Product product);
Ürün ekleme işlemini gerçekleştirir.
 
- 2) public void stockControl(String name);
Ürün stok kontrol işlemini name değişkeni üzerinden gerçekleştirir.

- 3) public int stockControl(int id);
Ürün stok kontrol işlemini id değişkeni üzerinden gerçekleştirir.

- 4) public Product findById(int productId)
Ürünü productId değerine göre bulan yardımcı fonksiyon.


 ***Order Service***
1 ) public void add(List<OrderItem> orderItemList, Customer customer)
Sipariş oluşturma işlemini gerçekleştirir.
