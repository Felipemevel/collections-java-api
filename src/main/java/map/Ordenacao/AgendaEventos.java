package main.java.map.Ordenacao;

import main.java.map.OperacoesBasicas.AgendaContatos;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){ this.eventosMap = new HashMap<>(); }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dateSet = eventosMap.keySet();
//
//        Collection<Evento> values = eventosMap.values();
//
//        eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 18), "Meu Aniversário", "Festa pra mim!!");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 25), "Aniversário do meu amor", "Festa pra ela!!");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 20), "Aniversário do meu irmão", "Festa pra ele!!");

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 31), "TESTE", "TESTANDO");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
