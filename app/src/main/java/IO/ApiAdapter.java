package IO;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiAdapter {
    private static ApiService API_SERVICE;
    private static Retrofit retrofit;
    private static String baseURL = "https://apcpruebas.es/";

    private static  final int tiempoConexion = 60;
    public  static  Retrofit getDatosServidor(){
        //Creamos un interceptor y le indicamos el nivel del log a usar.
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        //Asociar el interceptor a las peticiones
        OkHttpClient httpClient = new OkHttpClient.Builder()
        .readTimeout(tiempoConexion, TimeUnit.SECONDS)
        .writeTimeout(tiempoConexion, TimeUnit.SECONDS)
        .connectTimeout(tiempoConexion, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build();
        if(API_SERVICE == null){
            retrofit = new Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient)
                    .build();
            API_SERVICE = retrofit.create(ApiService.class);

        }
        return  retrofit;

    }

}
