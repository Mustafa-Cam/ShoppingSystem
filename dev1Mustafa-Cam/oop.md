Java'da OOP (nesne yönelimli programlama) konseptleri oldukça önemlidir. Java'da OOP'nin temel konu başlıkları:

1. **Sınıflar ve Nesneler:** Java'da, veri ve işlevselliği bir araya getiren sınıfları tanımlayabiliriz. Bu sınıflardan örnekler oluşturarak, gerçek dünyadaki nesneleri temsil ederiz.

2. **Encapsulation (Kapsülleme):** Sınıflar, veri alanlarını (alanlar) ve bunlar üzerinde çalışan işlevleri (metodlar) bir araya getirir. Böylece verilerin ve işlevlerin sınıf dışındaki kodlara karşı gizlenmesini sağlar.

3. **Kalıtım (Inheritance):** Kalıtım, bir sınıfın başka bir sınıftan özelliklerini ve davranışlarını miras alabilmesini sağlar. Bu, kodun yeniden kullanılabilirliğini artırır ve sınıflar arasında hiyerarşik ilişkiler kurulmasını sağlar.

4. **Polimorfizm (Polymorphism):** Polimorfizm, aynı ad altında farklı işlevselliği gerçekleştirebilme yeteneğidir. Bu, aynı metodun farklı şekilde davranabilmesini sağlar. Java'da, polimorfizm genellikle dinamik bağlama (dynamic binding) kullanılarak gerçekleştirilir.

5. **Arayüzler (Interfaces):** Bir arayüz, bir veya daha fazla sınıfın uygulamasını zorunlu kılan bir şablon görevi görür. Bir sınıf, bir arayüzü uyguladığında, arayüzde tanımlanan tüm yöntemleri (metodları) uygulamak zorunda kalır.

6. **Abstract Sınıflar ve Metodlar:** Abstract sınıflar, tamamlanmamış (abstract) metodlar içerebilir ve diğer sınıflar tarafından genişletilebilir. Abstract metodlar, sınıflar tarafından uygulanması gereken ancak abstract sınıfta uygulaması yapılmamış metodlardır.

7. **Nesne Yönelimli Tasarım Prensipleri:** Java'da OOP'nin temelini oluşturan bazı tasarım prensipleri vardır. Bunlar arasında SOLID prensipleri (Single Responsibility Principle, Open/Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, Dependency Inversion Principle) önemlidir.

Java'nın OOP yetenekleri, büyük ve karmaşık yazılım projelerini daha organize ve sürdürülebilir hale getirmeye olanak tanır.


# Sınıflar ve Nesenler

İlk olarak, Java'da OOP'nin temelini oluşturan Sınıflar ve Nesneler konusunu daha ayrıntılı bir şekilde açıklayalım.

### 1. Sınıflar ve Nesneler:

- **Sınıflar (Classes):** Java'da bir sınıf, belirli bir veri yapısını ve bu veri yapısında bulunan işlevselliği tanımlayan bir yapıdır. 
- Bir sınıf, alanlar (fields) ve metotlar (methods) içerir. Alanlar, sınıfın veri üyelerini temsil ederken, metotlar, bu veriler üzerinde işlem yapmak için kullanılan işlevleri temsil eder.

  ```java
  public class Araba {
      // Alanlar
      String marka;
      String model;
      int uretimYili;
      
      // Metotlar
      void calis() {
          System.out.println("Araba çalışıyor...");
      }
      
      void dur() {
          System.out.println("Araba durdu.");
      }
  }
  ```

- **Nesneler (Objects):** Sınıflar, bir nesnenin şablonunu tanımlar. 
- Nesneler, bellekte sınıf tarafından tanımlanan şablona göre oluşturulan örneklerdir. 
- Java'da, `new` anahtar kelimesi kullanılarak bir sınıfın bir nesnesi oluşturulabilir.

  ```java
  public class ArabaTest {
      public static void main(String[] args) {
          // Araba sınıfından bir nesne oluşturuluyor
          Araba araba1 = new Araba();
          araba1.marka = "Toyota";
          araba1.model = "Corolla";
          araba1.uretimYili = 2020;
          
          // Araba sınıfındaki metotlar çağrılıyor
          araba1.calis();
          araba1.dur();
      }
  }
  ```

Java'daki sınıflar ve nesneler, gerçek dünyadaki nesnelerin temsil edilmesini sağlar. 
Örneğin, bir araba sınıfı, bir arabanın markası, modeli ve üretim yılı gibi özelliklerini ve arabanın çalışma ve durma gibi davranışlarını tanımlayabilir. 
Bu sayede, kodun daha düzenli, anlaşılabilir ve yeniden kullanılabilir olması sağlanır.

# Encapsulation

Tabii, sıradaki başlık olan Encapsulation (Kapsülleme) konusunu daha ayrıntılı bir şekilde açıklayayım.

### 2. Encapsulation (Kapsülleme):

- **Kapsülleme Nedir?** Kapsülleme, bir sınıfın veri üyelerini (alanlar) ve bu alanlar üzerinde çalışan işlevleri (metotlar) bir araya getirerek, bu verilere doğrudan erişimi sınırlayan bir nesne yönelimli programlama kavramıdır. 
- Bu, verilerin sınıf dışındaki kodlara karşı gizlenmesini ve sadece belirli metotlar aracılığıyla erişilmesini sağlar.

- **Kapsülleme Avantajları:**
  - Güvenlik: Sınıf dışındaki kodların doğrudan verilere erişimini önleyerek, verilerin güvenliğini sağlar.
  - Esneklik: Sınıf içindeki verilerin nasıl kullanılacağına dair esneklik sağlar. Sınıf içindeki veri yapısını değiştirmek, sınıfın kullanıldığı diğer kodları etkilemez.
  - Kolay Bakım: Veri yapılarının gizlenmesi, sınıf içindeki değişikliklerin diğer kodlara minimum düzeyde etki etmesini sağlar, böylece bakım ve geliştirme süreçlerini kolaylaştırır.

- **Java'da Kapsülleme:** Java'da kapsülleme, sınıf içindeki alanları `private` erişim belirteci ile tanımlayarak gerçekleştirilir. Bu durumda, sınıf dışındaki kodlar doğrudan bu alanlara erişemezler. Bunun yerine, erişim metotları (getter ve setter metotları) kullanılarak verilere dolaylı olarak erişilir ve bu sayede verilere kontrol edilmiş bir şekilde erişim sağlanır.

  ```java
  public class Ogrenci {
      private String ad;
      private int yas;
      
      // Getter ve Setter metotları
      public String getAd() {
          return ad;
      }
      
      public void setAd(String ad) {
          this.ad = ad;
      }
      
      public int getYas() {
          return yas;
      }
      
      public void setYas(int yas) {
          if (yas >= 0) {
              this.yas = yas;
          } else {
              System.out.println("Yaş negatif olamaz.");
          }
      }
  }
  ```

  Yukarıdaki örnekte, `ad` ve `yas` alanları `private` olarak tanımlanmıştır. Bu alanlara doğrudan erişim yerine, `getAd`, `setAd`, `getYas` ve `setYas` gibi getter ve setter metotları kullanılarak kontrol edilmiş erişim sağlanır.

Kapsüllemenin kullanımı, Java'da güvenli ve düzenli kod yazmaya olanak tanır. Verilerin kontrolsüz erişimini engelleyerek, programın daha güvenli ve sağlam olmasını sağlar.

# Inheritance

Tabii, sıradaki konu başlığı olan Kalıtım (Inheritance) konusunu daha ayrıntılı bir şekilde açıklayayım.

### 3. Kalıtım (Inheritance):

- **Kalıtım Nedir?** Kalıtım, bir sınıfın başka bir sınıftan özelliklerini ve davranışlarını miras alabilmesini sağlayan bir nesne yönelimli programlama kavramıdır. 
- Kalıtım, sınıflar arasında bir tür "anne-baba" ilişkisi kurarak, kodun yeniden kullanılabilirliğini artırır ve kod tekrarını azaltır.

- **Üst Sınıf ve Alt Sınıf (Superclass ve Subclass):** Kalıtım ilişkisinde, özelliklerini ve davranışlarını diğer sınıfa miras veren sınıfa "üst sınıf" veya "anne sınıf" denir. 
- Mirası alan sınıfa ise "alt sınıf" veya "çocuk sınıf" denir. Alt sınıf, üst sınıfın tüm alanlarına ve metotlarına erişebilir.

- **Java'da Kalıtım:** Java'da kalıtım, `extends` anahtar kelimesiyle gerçekleştirilir. Bir alt sınıf, bir üst sınıftan yalnızca bir tane miras alabilir (tek yönlü kalıtım). 
- Alt sınıf, üst sınıfın tüm public ve protected alanlarına ve metotlarına erişebilir. Kalıtım, sınıflar arasında bir hiyerarşi oluşturur.

  ```java
  // Üst sınıf (Anne sınıf)
  public class Sekiller {
      protected double alan;
      protected double cevre;
      
      public void hesaplaAlan() {
          // Alan hesaplama kodu
      }
      
      public void hesaplaCevre() {
          // Çevre hesaplama kodu
      }
  }
  
  // Alt sınıf (Çocuk sınıf)
  public class Dikdortgen extends Sekiller {
      private double kenar1;
      private double kenar2;
      
      // Kenar uzunluklarını belirten bir kurucu metod
      public Dikdortgen(double kenar1, double kenar2) {
          this.kenar1 = kenar1;
          this.kenar2 = kenar2;
      }
      
      // Dikdörtgenin alanını hesaplayan metod
      public void hesaplaAlan() {
          alan = kenar1 * kenar2;
      }
  }
  ```

  Yukarıdaki örnekte, `Sekiller` sınıfı, alan ve çevre hesaplaması yapabilen genel bir şekil sınıfını temsil eder. 
- `Dikdortgen` sınıfı ise `Sekiller` sınıfından miras alarak dikdörtgenin özelliklerini ve alanını hesaplamak için özelleştirilmiş bir sınıfı temsil eder.

Kalıtımın kullanımı, kodun yeniden kullanılabilirliğini artırır, kod tekrarını azaltır ve kodun daha organize olmasını sağlar.
Ancak dikkatli kullanılmalıdır çünkü fazla derinleşen kalıtım hiyerarşileri karmaşıklığa neden olabilir.

  ```java
public class Hayvan {
protected String tur;
protected int yas;

    public Hayvan(String tur, int yas) {
        this.tur = tur;
        this.yas = yas;
    }
}

public class Kedi extends Hayvan {
private String renk;

    public Kedi(String tur, int yas, String renk) {
        super(tur, yas); // Üst sınıfın kurucu metodunu çağırır
        this.renk = renk;
    }
}

public class Test {
public static void main(String[] args) {
Kedi kedi = new Kedi("Ev kedisi", 3, "Siyah");
System.out.println("Tür: " + kedi.tur);
System.out.println("Yaş: " + kedi.yas);
System.out.println("Renk: " + kedi.renk);
}
}
  ```

Burda super var buna dikkat edelim. Kalıtım adı üstünde kalıtım olduğu için üst sınıfın özelliklerini almak zorundasın.
O yüzden alt sınıfın constructor'u başlatılırken üst sınıfın construcor'u da başlatılısn ki kalıtım olsun. 
Bunu da super() ile yapıyoruz. yani anne olsun üst sınıf alt sınıf da çocuk kalıtım olacaksa çocuk anneden özellliklerini almalı biyolojik olarak,
değil mi ? o yüzden bu kalıtımı da costructor ile yapıyoruz alt sınıfda super bu işi yapıyor. 


Tabii, bir sonraki başlık olan "Polimorfizm" konusunu açıklayayım.

# Polmorfizm

### 4. Polimorfizm:(kısaca Overloading ve Override)

- **Polimorfizm Nedir?** Polimorfizm, aynı isimli ancak farklı davranışlara sahip metotların aynı sınıf içinde veya farklı sınıflar arasında bulunabilmesine olanak tanıyan bir nesne yönelimli programlama kavramıdır. Bu, aynı isimli metotların farklı sınıflarda farklı işlevleri gerçekleştirebilmesini sağlar.

- **Türleri:**
  1. **Statik Polimorfizm (Aşırı Yükleme - Overloading):** Aynı isimli ancak farklı parametre listelerine sahip birden fazla metot tanımlanmasıdır. Çağrıldığı zaman hangi metotun çalışacağı, parametre listesine göre belirlenir.

     ```java
     public class Matematik {
         public int topla(int x, int y) {
             return x + y;
         }
         
         public double topla(double x, double y) {
             return x + y;
         }
     }
     ```

  2. **Dinamik Polimorfizm (Aşırı Yükleme - Overriding):** Alt sınıfların, üst sınıfın aynı isimli metotlarını kendi ihtiyaçlarına uygun şekilde yeniden tanımlamasıdır. Bu sayede aynı metot çağrısı farklı davranışlar sergileyebilir.

     ```java
     public class Sekiller {
         public void ciz() {
             System.out.println("Şekil çiziliyor.");
         }
     }
     
     public class Dikdortgen extends Sekiller {
         @Override
         public void ciz() {
             System.out.println("Dikdörtgen çiziliyor.");
         }
     }
     ```

- **Java'da Polimorfizm:** Java'da polimorfizm, aşırı yükleme (overloading) ve aşırı yazma (overriding) gibi mekanizmalarla gerçekleştirilir. Bu sayede aynı isimli metotlar veya sınıflar, farklı durumlarda farklı davranışlar sergileyebilirler. Polimorfizm, kodun daha esnek, anlaşılır ve yeniden kullanılabilir olmasını sağlar.



# Soyut Sınıflar ve Soyut Metotlar:

Elbette, bir sonraki başlık olarak "Soyut Sınıflar ve Soyut Metotlar" konusunu açabilirim.

### 5. Soyut Sınıflar ve Soyut Metotlar:

- **Soyut Sınıflar (Abstract Classes):** Soyut sınıflar, diğer sınıflar için bir şablon veya temel oluşturan sınıflardır. Soyut sınıflar, hem somut (concrete) metotlar hem de soyut (abstract) metotlar içerebilir. Soyut sınıflardan nesne oluşturulamaz, ancak alt sınıflar tarafından genişletilebilir.

- **Soyut Metotlar (Abstract Methods):** Soyut metotlar, gövdesiz metotlardır ve yalnızca soyut sınıflarda tanımlanabilir. Soyut metotlar, alt sınıflar tarafından zorunlu olarak uygulanmalıdır. Alt sınıflar, soyut sınıfın soyut metotlarını uygulayarak kendilerine özgü davranışları belirler.

- **Java'da Soyut Sınıflar ve Soyut Metotlar:** Java'da soyut sınıflar `abstract` anahtar kelimesiyle tanımlanır. Bir sınıf içinde en az bir soyut metot bulunuyorsa, sınıfın kendisi de soyut olmalıdır. Soyut sınıflardan nesne oluşturulamaz. Alt sınıflar, soyut sınıfın soyut metotlarını `@Override` etiketiyle uygulamak zorundadır.

  ```java
  // Soyut sınıf
  public abstract class Sekil {
      // Soyut metot
      public abstract double alanHesapla();
      
      // Somut metot
      public void ekranaYaz() {
          System.out.println("Şeklin alanı: " + alanHesapla());
      }
  }
  
  // Alt sınıf
  public class Dikdortgen extends Sekil {
      private double uzunluk;
      private double genislik;
      
      // Kurucu metod
      public Dikdortgen(double uzunluk, double genislik) {
          this.uzunluk = uzunluk;
          this.genislik = genislik;
      }
      
      // Soyut metodu implemente etme
      @Override
      public double alanHesapla() {
          return uzunluk * genislik;
      }
  }
  ```
  
Bu örnekte, `Sekil` soyut sınıfı, `alanHesapla` adında soyut bir metodu ve `ekranaYaz` adında somut bir metodu içerir. `Dikdortgen` sınıfı, `Sekil` soyut sınıfını genişleterek `alanHesapla` metotunu uygular. Bu sayede `Dikdortgen` sınıfı, kendi özelliklerine göre alan hesaplayabilir ve `Sekil` sınıfının davranışını genişletebilir.

# SOLID

SOLID prensipleri, nesne yönelimli programlama (OOP) alanında kodun daha okunabilir, esnek, sürdürülebilir ve genişletilebilir olmasını sağlayan beş temel prensipten oluşur. SOLID prensipleri, yazılım mühendisliğinde kaliteli ve modüler kod geliştirmenin temel taşlarından biridir. İşte SOLID prensipleri:

1. **Single Responsibility Principle (Tek Sorumluluk Prensibi - SRP):** Her sınıfın veya modülün sadece bir işlevi veya sorumluluğu olmalıdır. Bir sınıfın veya modülün değişmesi gereken tek neden, bir işlev veya sorumluluk değişikliği olmalıdır.

2. **Open/Closed Principle (Açık/Kapalı Prensibi - OCP):** Yazılım birimleri (sınıflar, fonksiyonlar, modüller vb.), genişlemeye açık ancak değişikliğe kapalı olmalıdır. Yani mevcut kodu değiştirmeden yeni davranışlar eklemek veya mevcut davranışları değiştirmek mümkün olmalıdır.

3. **Liskov Substitution Principle (Liskov Yerine Geçme Prensibi - LSP):** Alt sınıflar, üst sınıfların yerine geçebilmelidir, yani alt sınıflar, üst sınıfların tüm özelliklerini (sözleşmelerini) sağlamalı ve alt sınıf nesneleri, üst sınıf nesneleriyle yer değiştirebilmelidir.

4. **Interface Segregation Principle (Arayüz Ayrımı Prensibi - ISP):** İstemciler, kullanmadıkları arayüzlerden etkilenmemelidir. Bir sınıfın ihtiyaç duymadığı arayüzleri uygulamaması, gereksiz bağımlılıkların önlenmesini sağlar.

5. **Dependency Inversion Principle (Bağımlılıkların Ters Çevrilmesi Prensibi - DIP):** Yüksek seviyeli modüller, düşük seviyeli modüllere bağlı olmamalıdır. Bunun yerine, her iki tür modül de soyutlamalara (arayüzlere) bağlı olmalıdır. Ayrıca, soyutlamalar, detaylara bağlı olmamalıdır. Bu, sınıflar arasındaki sıkı bağımlılıkların azaltılmasını sağlar ve kodun daha esnek olmasını sağlar.

SOLID prensipleri, kodun daha okunabilir, esnek, sürdürülebilir ve genişletilebilir olmasını sağlar. Bu prensiplere uygun kodlar, değişikliklere daha kolay uyum sağlar, kod tekrarını azaltır ve kaliteli bir yazılım tasarımı sağlar.


### Examples(solid)

SOLID prensiplerini örnekler üzerinden açıklayalım:

1. **Tek Sorumluluk Prensibi (SRP):**
Örnek: Bir müşteri veritabanı sınıfı düşünelim. Bu sınıfın sorumluluğu, müşteri verilerini veritabanına kaydetmek ve çekmek olmalıdır. 
Eğer bu sınıf aynı zamanda e-posta gönderme veya rapor oluşturma gibi işlemleri de yaparsa, SRP ihlal edilir. 
Bunun yerine, e-posta gönderme işlevselliği için ayrı bir sınıf veya modül oluşturulmalıdır.

2. **Açık/Kapalı Prensibi (OCP):**
Örnek: Bir şekil çizme programı tasarlayalım. 
Bu program, farklı şekilleri çizebilmelidir (örneğin, dikdörtgen, daire, üçgen). 
Ancak her yeni şekil eklendiğinde mevcut kodu değiştirmememiz gerekir. 
Bunun yerine, her şekil için ayrı bir sınıf oluşturarak ve bu sınıfların bir arayüzü (interface) uygulayarak yeni şekiller ekleyebiliriz.
Bu sayede, mevcut kodu değiştirmeden yeni şekiller ekleyebiliriz.

3. **Liskov Yerine Geçme Prensibi (LSP):**
Örnek: Bir geometrik şekiller programı düşünelim. 
Bu programda, tüm şekillerin alanını hesaplayan bir metot bulunabilir. 
Ancak eğer bir alt sınıf, örneğin bir kare sınıfı, üst sınıf olan şekil sınıfını genişletirken kendi alan hesaplama mantığını uygulamazsa, LSP ihlal edilir. 
Yani alt sınıflar, üst sınıfın yerine geçebilmelidir ve aynı davranışı sergilemelidir.

4. **Arayüz Ayrımı Prensibi (ISP):**
Örnek: Bir çoklu işlevselliği olan bir arabirime (interface) sahip olduğumuzu düşünelim. 
Fakat bazı sınıflar, bu arabirimdeki tüm yöntemleri kullanmazsa, ISP ihlal edilir. 
Örneğin, bir sınıf sadece bazı yöntemleri kullanıyorsa ve diğerleri için boş veya varsayılan uygulamalar sağlanıyorsa, bu sınıflar için ayrı arayüzler oluşturulmalıdır.

5. **Bağımlılıkların Ters Çevrilmesi Prensibi (DIP):**
Örnek: Bir müşteri hizmetleri sınıfı, doğrudan bir e-posta gönderme servisine bağımlı olabilir. 
Ancak eğer ileride e-posta gönderme servisi değişirse veya farklı bir gönderme yöntemi kullanmak istenirse, tüm müşteri hizmetleri sınıfını değiştirmek gerekecektir. 
Bu yerine, müşteri hizmetleri sınıfı için bir arayüz tanımlanabilir ve e-posta gönderme servisi bu arayüzü uygular. 
Bu sayede, müşteri hizmetleri sınıfı, e-posta gönderme servisiyle doğrudan bağlı olmaz ve değişiklikler daha kolay yapılabilir.