package com.rcm.sistemas.agenda.domain.service;

import com.rcm.sistemas.agenda.domain.entity.Paciente;
import com.rcm.sistemas.agenda.domain.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public List<Paciente> listarTodos() {
        return this.pacienteRepository.findAll();
    }

    public Optional<Paciente> buscaPorId(Long id) {
        return this.pacienteRepository.findById(id);
    }

    public Paciente salvar(Paciente paciente) {
        return this.pacienteRepository.save(paciente);
    }

    public void deletar(Long id) {
        this.pacienteRepository.deleteById(id);
    }


}
