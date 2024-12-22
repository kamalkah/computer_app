package emsi.computer.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDTO {
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
    private String macAddress;
}
