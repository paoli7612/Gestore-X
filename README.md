# Gestore-Spedizioni

### Regole per lo svolgimento

- Obbligo di uso linguaggio **Java**
- Interfaccia grafica app desktop
- Meccanismi OOP
    - Incapsulamento
    - Ereditarietà
    - Polimorfismo
    - ...
- Vietata ereditarietà diretta da librerie Java
- Usare classi di sistema per input/output
- Usare **strutture dati** di libreria e i **generics**
- Eseguibile anche da CLI
- Presente documentazione HTML

### Descrizione del progetto

Si richiede l’implementazione di un software per la gestione di spedizioni tramite corriere.

Progetto munito delle seguenti funzionalità:
    - **Login e registrazione** dei clienti che inseriscono i dati delle loro spedizioni
    - **Login specifico per l’amministratore** (admin) della filiale di spedizione
    - ***Possibilità** di aggiornare lo stato di ogni singola spedizione
    - **Visualizzazioni personalizzate** (per clienti e amministratori) dello storico delle spedizioni e delle spedizioni in corso.

[Facoltativo 1 punto: per la data di immissione nel sistema si sfrutti la classe java.util.Date e
java.text.SimpleDateFormat dello standard JDK.]

[Facoltativo 1 punto: Nella visualizzazione dello stato delle spedizioni, si associ un codice colore per ogni riga della tabella in funzione dello stato della spedizione. Esempio: rosso se fallita, verde se ricevuta, …]

**L’amministratore deve essere in grado di poter cambiare lo stato di ogni spedizione.**
[Facoltativo 5 punti: In alternativa, rendere la tabella non modificabile da parte dell’amministratore. Bensì, creare un thread che periodicamente (ogni x secondi) cambi lo stato di una spedizione scelta in maniera casuale. Una volta scelta una spedizione, se essa è in transito si implementi una logica attraverso la quale la spedizione fallirà con una certa probabilità (ci si aiuti con un generatore di numeri casuali)].