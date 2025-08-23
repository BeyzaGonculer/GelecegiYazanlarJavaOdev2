# Fonksiyonlar 

## Customer Service
- ***public void add(Customer customer);***
Kullanıcı ekleme işlemini gerçekleştirir. 

- ***public void search(String name);***
Kullanıcı arama işlemini gerçekleştirir.


## Product Service
- ***public void add(Product product);***
Ürün ekleme işlemini gerçekleştirir.
 
- ***public void stockControl(String name);***
Ürün stok kontrol işlemini name değişkeni üzerinden gerçekleştirir.

- ***public int stockControl(int id);***
Ürün stok kontrol işlemini id değişkeni üzerinden gerçekleştirir.

- ***public Product findById(int productId);***
Ürünü productId değerine göre bulan yardımcı fonksiyon.


## Order Service
- ***public void add(List<OrderItem> orderItemList, Customer customer);***
Sipariş oluşturma işlemini gerçekleştirir.
