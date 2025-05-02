package pe.edu.vallegrande.beneficiary.dto;
import lombok.Data;

@Data
public class HealthDTO {
    private Integer idHealth;
    private String vaccine;
    private String vph;
    private String influenza;
    private String deworming;
    private String hemoglobin;
    private Integer personId;
}