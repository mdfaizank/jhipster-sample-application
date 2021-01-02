import React from 'react';
import MenuItem from 'app/shared/layout/menus/menu-item';
import { DropdownItem } from 'reactstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { Translate, translate } from 'react-jhipster';
import { NavLink as Link } from 'react-router-dom';
import { NavDropdown } from './menu-components';

export const EntitiesMenu = props => (
  <NavDropdown
    icon="th-list"
    name={translate('global.menu.entities.main')}
    id="entity-menu"
    style={{ maxHeight: '80vh', overflow: 'auto' }}
  >
    <MenuItem icon="asterisk" to="/product">
      <Translate contentKey="global.menu.entities.product" />
    </MenuItem>
    <MenuItem icon="asterisk" to="/product-category">
      <Translate contentKey="global.menu.entities.productCategory" />
    </MenuItem>
    <MenuItem icon="asterisk" to="/customer">
      <Translate contentKey="global.menu.entities.customer" />
    </MenuItem>
    <MenuItem icon="asterisk" to="/product-order">
      <Translate contentKey="global.menu.entities.productOrder" />
    </MenuItem>
    <MenuItem icon="asterisk" to="/order-item">
      <Translate contentKey="global.menu.entities.orderItem" />
    </MenuItem>
    {/* jhipster-needle-add-entity-to-menu - JHipster will add entities to the menu here */}
  </NavDropdown>
);
