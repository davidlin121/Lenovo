import React, {Component} from 'react';

import 'antd/dist/antd.css';
import './index.css';
import { Table, Input, Button, Popconfirm, Form, Col, Row, Layout} from 'antd';
import { Checkbox } from 'antd';


const columns = [{
  title: 'Name',
  dataIndex: 'name',
  //render: (text: React.ReactNode) => <a href="#">{text}</a>,
}, {
  title: 'Age',
  dataIndex: 'age',
}, {
  title: 'Address',
  dataIndex: 'address',
}];

const data = [{
  key: '1',
  name: 'John Brown',
  age: 32,
  address: 'New York No. 1 Lake Park',
}, {
  key: '2',
  name: 'Jim Green',
  age: 42,
  address: 'London No. 1 Lake Park',
}, {
  key: '3',
  name: 'Joe Black',
  age: 32,
  address: 'Sidney No. 1 Lake Park',
}, {
  key: '4',
  name: 'Disabled User',
  age: 99,
  address: 'Sidney No. 1 Lake Park',
}];


class App extends React.Component {
 

  render() {
   
    return (<body>
          <Row>
            <Col span={24} style={{textAlign: 'right'}}>
              <Button type="primary" htmlType="submit">
                Search
              </Button>
            </Col>
          </Row>

        <Table
            
        />
        </body>
    );
  }

}

export default App;






