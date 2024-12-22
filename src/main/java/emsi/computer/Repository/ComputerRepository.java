package emsi.computer.Repository;

import emsi.computer.entites.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProce(String proce);
}
