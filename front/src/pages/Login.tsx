import React from 'react';
import { Box, Card, CardContent, TextField, Button, Typography } from '@mui/material';

const Login: React.FC = () => {
  return (
    <Box sx={{ 
      display: 'flex', 
      minHeight: '100vh',
      alignItems: 'center',
      justifyContent: 'center',
      bgcolor: 'background.default'
    }}>
      <Card sx={{ 
        maxWidth: 400,
        width: '90%',
        p: 2
      }}>
        <CardContent>
          <Box sx={{ 
            display: 'flex', 
            flexDirection: 'column',
            alignItems: 'center',
            mb: 4
          }}>
            <Typography 
              variant="h3" 
              component="div"
              sx={{ 
                color: 'primary.main',
                fontWeight: 500,
                mb: 1
              }}
            >
              SM
            </Typography>
            <Typography 
              variant="h6"
              sx={{ color: 'text.secondary' }}
            >
              Saúde Mosaico
            </Typography>
          </Box>
          
          <Box component="form" sx={{ mt: 1 }}>
            <TextField
              fullWidth
              label="Email"
              variant="outlined"
              margin="normal"
              required
              autoFocus
            />
            <TextField
              fullWidth
              label="Senha"
              type="password"
              variant="outlined"
              margin="normal"
              required
            />
            <Button
              fullWidth
              variant="contained"
              size="large"
              sx={{ mt: 3, mb: 2 }}
            >
              Entrar
            </Button>
          </Box>
        </CardContent>
      </Card>
    </Box>
  );
};

export default Login;
