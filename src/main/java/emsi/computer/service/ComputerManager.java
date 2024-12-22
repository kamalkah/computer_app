package emsi.computer.service;

import emsi.computer.Repository.ComputerRepository;
import emsi.computer.entites.Computer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{
    public final ComputerRepository computerRepository;

    @Override
    public List<Computer> findComputerByProce(String proce) {
        return computerRepository.findByProce(proce);
    }

    @Override
    public Computer saveComputer(Computer computer) {
        return computerRepository.save(computer);
    }

}
