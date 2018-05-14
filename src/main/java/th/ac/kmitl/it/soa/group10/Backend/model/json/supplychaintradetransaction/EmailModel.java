package th.ac.kmitl.it.soa.group10.backend.model.json.supplychaintradetransaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class EmailModel {
    @JsonProperty("email")
    public String email;
}
