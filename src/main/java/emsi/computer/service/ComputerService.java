package emsi.computer.service;

import emsi.computer.entites.Computer;

import java.util.List;

public interface ComputerService {
    List<Computer> findComputerByProce(String proce);
    Computer saveComputer(Computer computer);
}
