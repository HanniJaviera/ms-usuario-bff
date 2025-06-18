package cl.duoc.ms_usuario_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_usuario_bff.clients.UsuarioDbFeignClient;
import cl.duoc.ms_usuario_bff.model.dto.UsuarioDTO;

@Service
public class UsuarioService {

    @Autowired
    UsuarioDbFeignClient usuarioDbFeignClient;

    public List<UsuarioDTO> selectAllUsuario() {
        return usuarioDbFeignClient.selectAllUsuario();
    }

    public UsuarioDTO getUsuarioById(Long id) {
        return usuarioDbFeignClient.getUsuarioById(id);
    }

    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        return usuarioDbFeignClient.createUsuario(usuarioDTO);
    }

    public UsuarioDTO updateUsuario(Long id, UsuarioDTO usuarioDTO) {
        return usuarioDbFeignClient.updateUsuario(id, usuarioDTO);
    }

    public String deleteUsuario(Long id) {
        return usuarioDbFeignClient.deleteUsuario(id);
    }
}
