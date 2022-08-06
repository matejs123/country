import { CompanyHistory } from './company-history.data';

export interface Company {
  id: number;
  profit: number;
  employeeCount: number;
  name: string;
  companyHistory: CompanyHistory[];
}
