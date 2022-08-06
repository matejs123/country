import { Company } from './company.data';

export interface Industry {
  id: number;
  name: string;
  gdp: number;
  companies: Company[];
}
