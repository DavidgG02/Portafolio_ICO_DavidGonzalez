package Portafolio.Portafolio.service.impl;

import Portafolio.Portafolio.dao.RoleDao;
import Portafolio.Portafolio.domain.Role;
import Portafolio.Portafolio.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl 
        implements RoleService {

    @Autowired
    private RoleDao roleDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Role> getRoles() {
        var lista = roleDao.findAll();               
        return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Role getRole(Role role) {
        return roleDao.findById(role.getRol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleDao.save(role);
    }

    @Override
    @Transactional
    public void delete(Role role) {
        roleDao.delete(role);
    }    
}
