package emsi.computer.web;

import emsi.computer.dto.ComputerDTO;
import emsi.computer.mapper.ComputerMapper;
import emsi.computer.service.ComputerManager;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    public ComputerManager computerManager;
    public ComputerMapper computerMapper;



    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce) {
        return computerMapper.toDTOs(computerManager.findComputerByProce(proce));
    }

    @MutationMapping
    public ComputerDTO saveComputer(@Argument("computerDetail") ComputerDTO dto) {
        ComputerDTO computerDTO = new ComputerDTO(dto.getProce(), dto.getRam(), dto.getHardDrive(), dto.getPrice(), dto.getMacAddress());
        return computerMapper.ComputerToComputerDTO(
                computerManager.saveComputer(computerMapper.ComputerDTOToComputer(computerDTO)));
    }
}
