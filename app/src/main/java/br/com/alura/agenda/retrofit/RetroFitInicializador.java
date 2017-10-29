package br.com.alura.agenda.retrofit;

import br.com.alura.agenda.services.AlunoService;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by Particular on 28/09/2017.
 */

public class RetroFitInicializador {

    private final Retrofit retrofit;

    public RetroFitInicializador() {
        retrofit = new Retrofit.Builder().baseUrl("http://10.10.10.102:8080/api/")
                .addConverterFactory(JacksonConverterFactory.create()).build();
    }

    public AlunoService getAlunoService() {
        return retrofit.create(AlunoService.class);
    }
}
