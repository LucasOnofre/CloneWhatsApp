package lucas.br.whatsapp.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Lucas on 13/03/2018.
 */

public final class ConfiguracaoFirebase {

    private static  FirebaseAuth        autenticacao;
    private static  DatabaseReference   referenciaFirebase;

    public static DatabaseReference getFirebase() {

        if (referenciaFirebase == null) {

            referenciaFirebase = FirebaseDatabase.getInstance().getReference();
        }
            return referenciaFirebase;
        }

        public static FirebaseAuth getFirebaseAutenticacao() {
            if (autenticacao == null) {
                autenticacao = FirebaseAuth.getInstance();
            }
            return autenticacao;
        }
}
