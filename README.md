# spring-boot-rest-template

Web uygulamalarında diğer dış sitemlerle haberleşmek için HTTP çağrıları yapmak yaygın bir gerekliliktir. Diğer servislere çağrı yapmak için RestTemplate kullanılabilir.

RestTemplate, client tarafında senkronize HTTP isteklerini yürütmek için Spring kütüphanesi içindeki default sınıftır.
Rest servislerin yaygınlaşmasından bu yana çoğu geliştirici,
Rest servislerini çağırmak için spring-boot-starter-web paketindeki Spring’in geleneksel RestTemplate’iyle çalışmaya alıştı.
Spring ayrıca spring-boot-starter-webflux paketinde WebClient adlı bir sınıfa sahiptir.

RestTemplate Avantajları ve Dezavantajları

- RestTemplate thread-safe bir yapıdadır.
- RestTemplate servlet yapısı üzerine inşa edilmiştir. Bu yüzden thread-per-request yaklaşımını izler. Sonuç olarak uygulama, thread-pool’u tüketecek veya tüm kullanılabilir belleği kaplayacak birçok thread oluşturacaktır. Bu sebeple performans problemleri ortaya çıkacaktır.
- Spring 5 ile birlikte bakım moduna geçmiştir. Muhtemelen ilerleyen sürümlerde desteklenmeyecektir.



İstek atılan proje : https://github.com/canozyigiit/spring-boot-demo-project