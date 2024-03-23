# Telekomunikacja
PROGRAM DO WYKRYWANIA I KORYGOWANIA BŁĘDÓW TRANSMISJI

  - PROGRAM_A - program zawierający działający algorytm i test
  - PROGRAM_B -zawiera menu i działający algorytm
------------------------------------------------------------------------------------------------------------------------------------
  - Macierz H1 - przeznaczona do korekcji jednego błędów transmisji
  - Macierz H2 - przeznaczona do korekcji dwóch błędów transmisji

Sformułowanie problemu:
Program zajmuje się implementacją kodów korygujących błędy transmisji dla różnych przypadków. W szczególności:

1. Opracowanie kodu korygującego pojedynczy błąd bitowy dla wiadomości ośmiobitowych (1 bajt).
2. Opracowanie kodu korygującego podwójny błąd bitowy dla wiadomości ośmiobitowych (1 bajt).

METODY TWORZENIA KODÓW:

Program implementuje różne metody tworzenia kodów korygujących, takie jak:

- Metoda powtarzania: Polega na wielokrotnym powtarzaniu wiadomości w celu zwiększenia odległości między słowami kodowymi.
- Kodowanie algebraiczne: Wykorzystuje dodatkowe bity parzystości do wykrywania i korygowania błędów, przy czym te bity są obliczane na 
  podstawie macierzy kontrolnej.
  
ZADANIE:
Główne zadania programu to:

- Opracowanie kodu korygującego pojedynczy błąd bitowy dla wiadomości ośmiobitowych.
- Opracowanie kodu korygującego podwójny błąd bitowy dla wiadomości ośmiobitowych.
- Napisanie programu przekodowującego dowolny plik do postaci zakodowanej jednym z opracowanych kodów (przygotowanie do transmisji) i odkodowywania go do postaci pierwotnej (odtworzenie danych po transmisji) z korekcją powstałych błędów. Program umożliwia operacje kodowania/odkodowania niezależnie od siebie, co pozwala na symulację błędów transmisji poprzez ręczną modyfikację pliku.

WSKAZÓWKI DLA UZYTKOWNIKA:

   - Upewnij się, że plik, który chcesz przekształcić, jest w formacie obsługiwanym przez program.
   - Korzystaj z odpowiednich opcji programu do kodowania i dekodowania danych.
   - Dokładnie śledź komunikaty wyświetlane przez program, aby monitorować proces przekształcania danych.

Folder out zawiera wbudowane 3 pliki tekstowe:
   - start - plik txt, który zostanie zakodowany i przesłany
   - mid - plik txt będący plikiem start.txt po kodowaniu
   - end - plik txt pod przesłaniu i odkodowaniu
Plik mid.txt zawsze będzie miał rozmiar dokładnie dwa razy większy od start.txt/end.txt.

Możliwa jest modyfikacja programu, aby działał dla dowolnego pliku. Aby to uzyskać należy zmodyfikować odpowiednio klasę Main.

Dziękujemy za korzystanie z programu!


















