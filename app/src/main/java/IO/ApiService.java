package IO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("villanos.php")
    Call<RespuestaServidor> getDatos();
}
